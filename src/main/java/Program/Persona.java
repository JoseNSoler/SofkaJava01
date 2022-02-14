package Program;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Persona {
    private static final char sexoH = 'H';
    private static final char sexoM = 'M';

    private static final int pesoBajo = -1;
    private static final int pesoIdeal = 0;
    private static final int pesoMalo = 1;

    private String nombre = "";
    private int edad = 0;
    private double peso = 0;
    private double altura = 0;
    private String DNI;
    private char sexo = sexoH;


    // ------------------------------------------------ CONSTRUCTORES PUBLICOS ------------------------------------------------
    public Persona(String nombre, int edad, char sexo, double altura, double peso) {
        this(nombre, edad, sexo);
        setAltura(altura);
        setPeso(peso);
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
    }

    public Persona() {
        this.DNI = this.generaDNI();
        System.out.println("Se creo una persona con DNI con Nro: " + this.DNI);
    }


    // ----------------------------------------------------- METODOS PRIVADOS -----------------------------------------------------

    /** Funcion para crear un DNI aleatorio, primero en base a un numero de 8 digitos, se calcula su modulo y asigna una letra segun su valor
     *
     * @return String con dni y dniLetra
     */
    private String generaDNI() {
        // Clave valor segun codificaion DNI
        Map<Integer, Character> map = Stream.of(new Object[][]{
                {0, 'T'}, {1, 'R'}, {2, 'W'}, {3, 'A'}, {4, 'G'}, {5, 'M'}, {6, 'Y'}, {7, 'F'}, {8, 'P'},
                {9, 'D'}, {10, 'X'}, {11, 'B'}, {12, 'N'}, {13, 'J'}, {14, 'Z'}, {15, 'S'}, {16, 'Q'}, {17, 'V'},
                {18, 'H'}, {19, 'L'}, {20, 'C'}, {21, 'K'}, {22, 'E'},
        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (Character) data[1]));

        // Numero aleatorio de 8 digitos
        int dniRandom = (int) Math.round(Math.random() * 100000000);

        // Comparacion letra final en base a dniRandom
        final char[] dniLetra = new char[]{'Z'};
        map.forEach((key, tab) -> {
            // Se haya el dni modulo 23, y depende del resultado(key), asocia (value) al resultado dniletra
            if(key == dniRandom % 23)
                dniLetra[0] = tab;
        });

        return String.format("%d%c",dniRandom, dniLetra[0]);
    }

    /** Funcion que comprueba si el caracter <sexo>, es un genero permitido por el programa
     *
     * @param sexo = caracter M = Mujer , H = Hombre
     * @return caracter segun sexo, si no coincide, devuelve por defecto sexoH
     */
    private Character comprobarSexo(char sexo){
        System.out.println(sexo);
        if ((sexo != sexoH && sexo != sexoM)) {
            System.out.println("__X Error: Sexo no identificado, solo letras (H = Hombre/M = Mujer), se asignara H automaticamente");
            return 'O';
        }
        else
            return (sexo == sexoH) ? sexoH : sexoM;
    }


    // ------------------------------------------------ METODOS PUBLICOS ------------------------------------------------

    /**
     * calcularIMC => calcula el indice de maca corporal dependiendo de (this.peso/(this.altura^2))
     *
     * @return -1 IMC menor a 20, peso malo __ 0 IMC valor ideal, peso ideal __ 1 IMC mayor a 25, sobrepeso
     */
    public int calcularIMC() {
        // Formula
        double imcValue = (this.peso / (this.altura * this.altura));

        if (imcValue < 20) return pesoBajo;
        if (imcValue > 20 && imcValue <= 25) return pesoIdeal;
        return pesoMalo;
    }


    /** Funcion para comprobar si la persona es mayor de edad en base a su this.edad
     *
     * @return true si es mayor de 18 años, false de lo contrario
     */
    public boolean esMayorDeEdad() {
        if(this.edad >= 18) return true;
        return false;
    }


    // ----------------------------------------- SETTER-MODIFICADORES PUBLICOS ------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int setEdad(int edad) {
        if (edad < 0) {
            System.out.println("__X Error: Edad no puede ser menor a 0 años");
            return -1;
        }
        else this.edad = edad;
        return 1;
    }

    public void setSexo(char sexo) {
        if (this.comprobarSexo(sexo) != 'O'){
            this.comprobarSexo(sexo);
        }
    }

    public int setPeso(double peso) {
        if (peso <= 0){
            System.out.println("__X Error: Peso no puede ser menor o igual a 0");
            return -1;
        }
        else this.peso = peso;
        return 1;
    }

    public void setAltura(double altura) {
        if (altura < 0) System.out.println("__X Error: Altura no puede ser menor o igual a 0");
        else this.altura = altura;
    }

    // ------------------------------------------ FORMATO ESPECIAL CON INFORMACION ---------------------------------------------
    @Override
    public String toString() {
        return "Esta es la persona con las siguientes caracteristicas: " +
                "\nNombre = " + this.nombre +
                "\nEdad = " + this.edad + " años" +
                "\nDNI = " + this.DNI +
                "\nSexo = " + this.sexo +
                "\nPeso = " + this.peso + "Kg" +
                "\nAltura = " + this.altura + " metros" +
                "\nPuede cambiar cualquier propiedad (excepto DNI) usando los metodos: set+(atributo a cambiar) Ej: setNombre\n";
    }
}
