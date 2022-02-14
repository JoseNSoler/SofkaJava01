package Program.Electro;

public class Lavadora extends Electrodomestico{
    private static final double cargaDefault = 5;

    private double carga = cargaDefault;


    // ------------------------------------------------ CONSTRUCTORES PUBLICOS ------------------------------------------------

    public Lavadora(double carga, double precio, double peso, String color, char consumoEnergetico){
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
        System.out.println("ALL PARAM - Se creo la lavadora con los valores:\n" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Carga " + this.carga);
    }

    public Lavadora(double precio, double peso){
        super(precio, peso);
        System.out.println("2 PARAM - Se creo la lavadora con los valores:" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Carga " + this.carga);

    }

    public Lavadora(){
        super();
        System.out.println("3Se creo la lavadora con los valores:" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Carga " + this.carga);
    }


    // ----------------------------------------------------- METODOS PUBLICOS -----------------------------------------------------

    @Override
    public double precioFinal(){
        double precioLava = super.precioFinal();
        System.out.println(precioLava + " = Precio sin adimentos de la subclase");
        if(this.carga > 30) precioLava += 50;
        return precioLava;
    }

    // ----------------------------------------- GETTER-ACCESOS ATRIBUTOS PUBLICOS ---------------------------------------------------

    public double getCarga(){return this.carga;}

}

