package Program.Productos;

public class Serie implements Entregable {

    private String titulo = "";
    private String genero = "";
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String creador = "";

    // -------------------------------------------- CONSTRUCTORES PUBLICOS ---------------------------------------

    public Serie(String titulo, String creador,String genero,int numeroTemporadas) {
        this(titulo, creador);
        this.genero = genero;
        this.numeroTemporadas = numeroTemporadas;
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(){
        this.toString();
    }

    // ----------------------------------------------- METODOS PUBLICOS ----------------------------------------

    @Override // Entregado es true, el titulo fue entregado a alguien
    public void entregar(){ this.entregado = true; }

    @Override // Entregado es false, el titulo fue devuelto por alguien
    public void devolver(){ this.entregado = false; }

    @Override // Compara la serie principal con el objeto a, analiza el que tenga mayor numero de temporadas y lo devuelve
    public Object compareTo(Object a){
        Serie serieComparar = (Serie) a;
        return (((Serie) a).getNumeroTemporadas() > this.getNumeroTemporadas()) ? a : (Object) this;

    }

    @Override // Formateador para visualizar textualmente el objeto serie
    public String toString(){
        return String.format("SERIE: su nombre es \"%s\" del genero \"%s\", tiene \"%s\" temporadas y fue creado por \"%s\", este titulo esta entregado=%b",
                getTitulo(), getGenero(), getNumeroTemporadas(), getCreador(), this.entregado);
    }


    // --------------------------------------- GETTER-ACCESOS ATRIBUTOS PUBLICOS -----------------------------------


    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
