package Program.Productos;

public class Videojuego implements Entregable{
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";


    // -------------------------------------------- CONSTRUCTORES PUBLICOS ---------------------------------------

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this(titulo, horasEstimadas);
        this.genero = genero;
        this.compania = compania;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(){
        this.toString();
    }


    // ----------------------------------------------- METODOS PUBLICOS ----------------------------------------

    @Override // Entregado es true, el titulo fue entregado a alguien
    public void entregar(){ this.entregado = true; }

    @Override // Entregado es false, el titulo fue devuelto por alguien
    public void devolver(){ this.entregado = false; }

    @Override // Compara el videojuego principal con el objeto a, analiza el que tenga mayor numero de horas y lo devuelve
    public Object compareTo(Object a){
        Videojuego serieComparar = (Videojuego) a;

        return (((Videojuego) a).getHorasEstimadas() > this.getHorasEstimadas()) ? a : (Object) this;

    }

    @Override // Formateador para visualizar textualmente el objeto serie
    public String toString(){
        return String.format("VIDEOJUEGO: su nombre es \"%s\" del genero \"%s\", tiene un total estimadas de \"%s\" horas y fue creado por la compañia \"%s\", este titulo esta actualmente entregado=%b",
                getTitulo(), getGenero(), getHorasEstimadas(), getCompania(), this.entregado);
    }

    // --------------------------------------- GETTER-ACCESOS ATRIBUTOS PUBLICOS -----------------------------------


    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
