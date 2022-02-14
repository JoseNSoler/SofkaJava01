package Program.Electro;

public class Television extends Electrodomestico{
    private static final double resolucionDefault = 20;
    private static final boolean sintTDTdefault = false;

    private double resolucion = resolucionDefault;
    private boolean sintTDT = sintTDTdefault;


    // ------------------------------------------------ CONSTRUCTORES PUBLICOS ------------------------------------------------

    public Television(double resolucion, boolean sintTDT, double precio, double peso, String color, char consumoEnergetico){
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
        System.out.println("ALL PARAM - Se creo el televisor con los valores:\n" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Resolucion " + this.resolucion + "TDT " + this.sintTDT);
    }

    public Television(double precio, double peso){
        super(precio, peso);
        System.out.println("2 PARAM - Se creo el televisor con los valores:" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Resolucion " + this.resolucion + "TDT " + this.sintTDT);

    }

    public Television(){
        super();
        System.out.println("3Se creo el televisor con los valores:" + this.getConsumoEnergetico() + " - " +
                this.getColor() + " - " + this.getPeso() + " - " + this.getPrecioBase() + " precio final " +
                this.precioFinal() + "\n Resolucion " + this.resolucion + "TDT " + this.sintTDT);
    }


    // ----------------------------------------------------- METODOS PUBLICOS -----------------------------------------------------

    @Override
    public double precioFinal(){
        double precioTele = super.precioFinal();
        System.out.println(precioTele);
        if(this.resolucion > 40) precioTele += ((precioTele * 30) / 100);
        if(this.sintTDT == true) precioTele += 50;
        return precioTele;
    }

    // ----------------------------------------- GETTER-ACCESOS ATRIBUTOS PUBLICOS ---------------------------------------------------

    public double getPulgadas(){return this.resolucion;}
    public boolean getSintTDT(){return this.sintTDT;}
}
