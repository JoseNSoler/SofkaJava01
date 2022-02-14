package Program.Electro;

import java.text.*;
import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Map;
import java.util.spi.CurrencyNameProvider;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Electrodomestico{

    private static final String eurSign = Currency.getInstance("EUR").getSymbol(Locale.US);
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final char[] valoresEnergeticos = "ABCDEF".toCharArray();
    private static final Map<Integer, Character> map = Stream.of(new Object[][]{
            {100, 'A'}, {80, 'B'}, {60, 'C'}, {50, 'D'}, {30, 'E'}, {10, 'F'},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (Character) data[1]));

    private static final String[] valoresColores = new String[] {"blanco", "negro", "rojo", "azul", "gris"};


    private static final double precioBaseDefecto = 100;
    private static final String colorDefecto = "blanco";
    private static final char consumoEnergeticoDefecto = 'F';
    private static final double pesoDefecto = 5;



    private double precioBase = precioBaseDefecto;
    private String color = colorDefecto;
    private char consumoEnergetico = consumoEnergeticoDefecto;
    private double peso = pesoDefecto;



    // ------------------------------------------------ CONSTRUCTORES PUBLICOS ------------------------------------------------
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico){
        this(precioBase, peso);
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("ALL PARAM - Se creo el electrodomestico con los valores: " + this.consumoEnergetico + " - " +
                this.color + " - " + this.peso + " - " + this.precioBase + " precioFinal" + this.precioFinal());
    }


    public Electrodomestico(double precioBase, double peso){
        this();
        this.peso = peso;
        this.precioBase = precioBase;
        System.out.println("2 PARAM - Se creo el electrodomestico con los valores: " + this.consumoEnergetico + " - " +
                this.color + " - " + this.peso + " - " + this.precioBase + " precioFinal" + this.precioFinal());

    }

    public Electrodomestico(){
        System.out.println("NO PARAM - Se creo el electrodomestico con los valores: " + this.consumoEnergetico + " - " +
                this.color + " - " + this.peso + " - " + this.precioBase + " precioFinal" + this.precioFinal());

    }

    // ----------------------------------------------------- METODOS PUBLICOS -----------------------------------------------------

    /**
     * Fucnion para saber precio final en base a variables de letra de consumo y peso
     * @return valor final
     */
    public double precioFinal(){
        double precioFinal = this.precioBase;
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if(this.consumoEnergetico == entry.getValue()) {
                precioFinal += entry.getKey();
            }
        }

        if(this.peso >= 0 && this.peso <=19) precioFinal += 10;
        if(this.peso >= 20 && this.peso <= 49) precioFinal += 50;
        if(this.peso >= 50 && this.peso <= 79) precioFinal += 80;
        if(this.peso >= 80) precioFinal += 100;

        return precioFinal;
    }
    // ----------------------------------------------------- METODOS PRIVADOS -----------------------------------------------------

    /** Funcion para comprobar si el consumo de energia introducido es el apropiado (solo letras de A-Z)
     *
     * @param consumoEnergetico = valor por defecto F, o valor de usuario
     * @return valor validado en el array valoresEnergeticos, o por defecto F
     */
    private char comprobarConsumoEnergetico(char consumoEnergetico){
        for(char element: valoresEnergeticos)if(consumoEnergetico == element) return element;
        return consumoEnergetico;
    }


    private String comprobarColor(String color){
        String colorFormat = color.toLowerCase(Locale.ROOT);
        for (String element: valoresColores) if(colorFormat == element) return element;
        return colorFormat;
    }


    // ----------------------------------------- GETTER-ACCESOS ATRIBUTOS PUBLICOS ---------------------------------------------------

    public String getPrecioBase(){return df.format(this.precioBase) + eurSign;}
    public String getColor(){return this.color;}
    public char getConsumoEnergetico(){return this.consumoEnergetico;}
    public String getPeso(){return df.format(this.peso) + "Kg";}
}
