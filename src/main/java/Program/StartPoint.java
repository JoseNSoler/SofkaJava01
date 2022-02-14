package Program;

import Program.Electro.Lavadora;
import Program.Electro.Electrodomestico;
import Program.Electro.Television;

import java.text.NumberFormat;
import java.util.*;
import java.lang.Math;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class StartPoint {
    static Scanner sc = new Scanner(System.in); // Scanner publico para otras funciones

    // --------------------------------------------- FUNCIONES POR SEGUN EJERCICIOS PLANTEADOS --------------------------------------------------------
    /**
     * 1 - 2) Funcion que incorpora los puntos 1 y 2, comparar dos numeros
     * 1- compara number1 y number2 (nros aleatorios) he indica cual es mayor de los dos
     * 2- compara dos valores introducidos por el usuario (number1 y number2)_
     * _ e indica si son mayores, menores o iguales.
     */
    static void option1_2() {
        System.out.println("_Comparar dos numeros si son mayores menores o iguales");
        boolean condition = true; // Bucle infinito
        String answer;

        while (condition) {
            int number1;
            int number2;
            int userOpt; // Opciones del usuario 1 - 2

            System.out.println("__Introducir numero 1 para calcular dos valores aleatorios\n" +
                    "__O numero 2 para introducir manualmente dos numeros");

            userOpt = (int) compareInput("Int"); // Opcion de usuario

            if (userOpt == 2) { // Usuario introduce dos numeros
                System.out.println("_2_ Introduzca un numero y presione tecla Enter, hacer lo mismo para el segundo numero");
                number1 = (int) compareInput("Int");
                number2 = (int) compareInput("Int");
            } else if (userOpt == 1) { // Numeros generados automaticamente
                number1 = (int) (Math.random() * 750);
                number2 = (int) (Math.random() * 750);
            } else {
                System.out.println("__) Opcion incorrecta, solo numeros/opcion 1 - 2");
                continue;
            }

            answer = (number1 > number2) ? "==>Numero 1 es Mayor" : "==>Numero 2 es Mayor";
            answer = (number1 == number2) ? "==>Numeros 1 y 2 son iguales" : answer;

            System.out.println("Numero1 = " + number1 +
                    "\nNumero2 = " + number2 +
                    "\nRespuesta" + answer +
                    "\nRepetir Programa? [Si/no]");

            // Si no se repite el programa, condition pasa a ser false, y detiene ciclo
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 3) Funcion que incorpora el punto 3, area de un circulo
     * La funcion pregunta por userValue, un String con solo caracteres decimales-numericos
     * para luego aplicar la formula (PI * (userValue^2))
     */
    static void option3(){

        boolean condition = true; // Bucle infinito

        while(condition){
            System.out.println("_Calcular el área de un círculo\n__Introduzca un numero/decimal para el radio");

            double userValue = Double.parseDouble((String)compareInput("stringDouble")); // Validacion

            // String formateado con operacion matematica
            String resultStr = String.format("El area de un circulo con radio de: %.4f, es por un valor de %.4f",
                    userValue, (Math.PI)*(Math.pow(userValue, 2)));

            System.out.println(resultStr);

            // Repetir programa calcular area
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }

    }


    /**
     * 4) Funcion que incorpora el punto 4, calcular el IVA de un precio numerico/decimal
     * La funcion pregunta por userValue, un String con solo caracteres decimales-numericos
     * para luego aplicar el IVA de 21%
     */
    static void option4(){
        final int IVA = 21;
        boolean condition = true; // Bucle infinito
        final NumberFormat currencyN = NumberFormat.getCurrencyInstance(new Locale("es", "US"));

        while(condition){
            System.out.println("_Calcular el IVA de un valor decimal o numerico\n" +
                    "__Introduzca un numero/decimal para calcular");

            double userValue = Double.parseDouble((String)compareInput("stringDouble")); // Validacion

            System.out.println("El IVA por 21% sobre el valor " +
                    currencyN.format((int)userValue) +
                    " es por un total de = " +
                    currencyN.format( (int)(userValue + ((userValue * IVA) / 100))) ) ; // operacion matematica

            // Repetir programa calcular area
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 5 - 6) Funcion que incorpora el punto 5, mostrar los numeros pares e impares del 1-100
     * counter = 1 -- finalNumber = 100
     */
    static void option5_6(){
        boolean condition = true; // Bucle infinito

        while(condition){
            int counter = 1;
            int finalNumber = 100;

            System.out.println("_Numero pares e impares del 1-100 con cilos <for> y <while>\n");

            // Titulo : Pares --------------------- Impares
            String title = String.format("%s %48s", "Pares","|   Impares");
            System.out.println(title);

            // Imprimir en formatos de finalNumber/5 sobre el valor final
            for(int unQuinto=(finalNumber/5); unQuinto<=(finalNumber);unQuinto += (finalNumber/5)){
                String lineIzqEven = "";
                String lineDerOdd = "";


                while(counter <= unQuinto){
                    // Si es par, agrega el numero a el string lineIzqEven hasta llegar finalNumber/5
                    if(counter % 2 == 0) lineIzqEven = String.format("%s%4d",lineIzqEven, counter);
                    // Si es impar, agrega el numero a el string lineDerOdd
                    else lineDerOdd = String.format("%s%4d",lineDerOdd, counter);
                    counter++;
                }


                /*
                // Solucion parte 6, implementacion con ciclo for, descomentar esta seccion de codigo
                for(;counter <= unQuinto;counter++){
                    // Si es par, agrega el numero a el string lineIzqEven hasta llegar finalNumber/5
                    if(counter % 2 == 0) lineIzqEven = String.format("%s%4d",lineIzqEven, counter);
                        // Si es impar, agrega el numero a el string lineDerOdd
                    else lineDerOdd = String.format("%s%4d",lineDerOdd, counter);
                }
                 */

                // Suma los string pares e impares, para lograr un formato de salida
                System.out.println(lineIzqEven + "   |" + lineDerOdd);
            }

            counter = 1;
            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 7) Funcion que incorpora el punto 7, Lee un número por teclado_
     * _ y comprueba que este numero es mayor o igual que cero. Si no lo es lo volverá a pedir (do while),_
     * _ después muestra ese número por consola.
     * userNum = numero ingresado por teclado.
     */
    static void option7() {
        boolean condition = true; // Bucle infinito
        boolean conditionNumber = true; // Bucle infinito pedir numero positivo al usuario


        // Condicion para repetir programa si el usuario desea
        while (condition) {
            System.out.println("_ Comparar numero >= 0\n__ Ingrese un numero entre -2147483648 a 2147483647.");

            // Condicion a repetir hasta que usuario ingrese numero positivo decimal o entero
            while(conditionNumber) {
                double userNum = (double)compareInput("intAndDouble"); // Numero de usuario

                if ((userNum) < 0) {
                    System.out.println("==X El numero ingresado " + userNum + " no es mayor o igual a 0\n" +
                            "=>INGRESE UN NUMERO MAYOR O IGUAL A 0");
                } else {
                    System.out.println("=> El numero " + userNum + " es mayor o igual a 0!!");
                    conditionNumber = false;
                }

            }
            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
            else{
                conditionNumber = true;
                condition = true;
            }
        }
    }

    /**
     * 8) Funcion que incorpora el punto 8, Lee un inputUser y determina si es un dia de la semana_
     * _e imprime si es un dia laboral
    */
    static void option8() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition) {

            // Descripcion del programa y peticion para ingreso de datos
            System.out.println("_ Saber si un dia de la semana es laboral\n==> Introduzca un dia de la semana (sin acento ni signos de puntiacion) Ej: Lunes");
            String inputUser = (String) compareInput("StringSpace");

            // Switch case dependiendo del dia
            switch (inputUser){
                case("Lunes"):
                case("Martes"):
                case("Miercoles"):
                case("Jueves"):
                case("Viernes"):
                    System.out.println("El dia " + inputUser +" se debe laborar");
                    break;
                case("Sabado"):
                case("Domingo"):
                    System.out.println("El dia " + inputUser + " NO se debe laborar");
                    break;
                default:
                    System.out.println("Dia de la semana no valido"); // Datos ingresados no corresponden a un dia de la semana
            }
            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 9) Funcion que incorpora el punto 9, Lee un inputUser (cadena de texto) y la concatena con la oracion:
     * _ "La sonrisa sera la mejor arma contra la tristeza"
     */
    static void option9() {
        boolean condition = true; // Bucle infinito
        char[] initialStr = ("La sonrisa sera la mejor arma contra la tristeza").toCharArray(); // Cadena a reemplazar: caracter a = e
        String initielStr = "";

        // Bucle para cambiar a por e
        for(char ch: initialStr){ initielStr += (ch=='a') ? 'e' : ch; }


        // Condicion para repetir programa si el usuario desea
        while (condition) {
            // Descripcion del programa y peticion para ingreso de datos
            System.out.println("_"+"\"" + initielStr +"\" y concatenar una frase\n" +
                    "==> Introduzca una cadena de texto para concatenar a la frase anterior");
            // Obtener
            String inputUser = (String) compareInput("StringSpace");

            System.out.println(initielStr + " " + inputUser);

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 10) Funcion que incorpora el punto 10, Lee un inputUser (cadena de texto) y elimina los espacios de esta
     */
    static void option10() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition){
            // Descripcion del programa y peticion para ingreso de datos
            System.out.println("_ Quitar espacios en una cadena de texto\n" +
                    "==> Introduzca una cadena de texto");
            // Obtener texto del usuario y remover los espacios
            String inputUser = ((String) compareInput("StringSpace")).replace(" ", "");

            System.out.println(inputUser);

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 11) Funcion que incorpora el punto 11, Lee un inputUser (cadena de texto) y hacer un conteo de caracteres
     * adicional, imprime la cantidad de vocales presentes en esta misma.
     */
    static void option11() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition){
            // Declaracion e inicializacion de contadores para las vocales
            int counterA, counterE, counterI, counterO, counterU;
            counterA = counterE = counterI = counterO = counterU = 0;

            // Descripcion del programa y peticion para ingreso de datos
            System.out.println("_ Contador de caracteres y vocales en una cadena de texto\n" +
                    "==> Introduzca una cadena de texto");

            // Obtener texto del usuario y remover los espacios
            String inputUser = ((String) compareInput("StringSpace"));

            char[] charStr = inputUser.toCharArray();

            for(char ch: charStr){
                if (ch=='a') counterA++;
                if (ch=='e') counterE++;
                if (ch=='i') counterI++;
                if (ch=='o') counterO++;
                if (ch=='u') counterU++;
            }

            System.out.println("La oracion anterior contiene " + inputUser.length() +
                    ". Tambien contiene un total de vocales de:\n" +
                    "a:" + counterA + "  " +
                    "e:" + counterE + " \n" +
                    "i:" + counterI + "  " +
                    "o:" + counterO + " \n" +
                    "u:" + counterU);

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 12) Funcion que incorpora el punto 12, Pedir al usuario dos palabras y mostrar sus diferencias
     */
    static void option12() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while(condition){
            String diffStr = "";
            int counter = 0;

            System.out.println("_ Comparar dos palabras y mostar diferencias\n" +
                    "==> Introduzca la primera palabra");
            // Obtener primera palabra
            char[] userWord1 = ((String) compareInput("StringSpace")).toCharArray();

            // Obtener segunda palabra
            System.out.println("==> Introduzca la segunda palabra a comparar");
            char[] userWord2 = ((String) compareInput("StringSpace")).toCharArray();


            for(char ch: userWord2){
                 if(userWord1[counter] == ch)diffStr += " ";
                 else diffStr += ch;
            }
            System.out.println(diffStr);
            System.out.println("↑ estas son las diferencias con la primera palabra introducida");

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 13) Funcion que incorpora el punto 13, consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
     */
    static void option13() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition) {

            // Crear formato para fecha y hora actuales
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("_ Consultar hora actual (AAAA/MM/DD) (HH:MM:SS)\n" + "Segun su computador, son las: " + dateFormatter.format(now));

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }

    /**
     * 14) Funcion que incorpora el punto 14, leer un numero +/- introducido por el usuario y sumarlo de 2 en 2 hasta 1000
     */
    static void option14() {
        boolean condition = true; // Bucle infinito
        int limitN = 1000;

        // Condicion para repetir programa si el usuario desea
        while (condition) {
            System.out.println("_ Contador 2 en 2 hasta 1000, desde un numero\n" +
                    "==> Introduzca un numero desde el cual desea iniciar el contador");
            int counter = (int) compareInput("Int");

            // Imprimir los numeros en filas de 40 valores
            for(int twentyFive=(limitN/25); twentyFive<=limitN;twentyFive+=(limitN/25)){
                String fileNumbers = "";

                while(counter <= twentyFive){
                    fileNumbers = String.format("%s%4d",fileNumbers, counter += 2);
                    counter += 2;
                }
                System.out.println(fileNumbers);
            }

            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 15) Funcion que incorpora el punto 15, Menu de opciones, repetir con 1-7 y salir con 8
     */
    static void option15() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition) {
            System.out.println("******************************************");
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
            int option = (int) compareInput("Int");

            switch (option){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                    condition = false;
                    break;
                default:
                    System.out.println("__X Opcion incorrecta, solo numeros entre 1-8");
            }
        }
    }

    /**
     * 16) Funcion que incorpora el punto 16, Creacion de persona clase y 3 objetos
     */
    static void option16() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition) {
            System.out.println("_ Crear Objeto Persona, Introduzca las siguientes variables que desea aplicar\n" +
                    "==> Nombre");

            String name = (String) compareInput("StringSpace");


            System.out.println("==> Edad");
            int age = (int) compareInput("Int");

            System.out.println("==> Sexo");
            char[] chSex = ((String)(compareInput("Sex"))).toCharArray();

            System.out.println("==> Peso (en Kg)");
            double weight = (double)(compareInput("intAndDouble"));

            System.out.println("==> Altura (en m)");
            double height = (double)(compareInput("intAndDouble"));


            Persona person1 = new Persona(name, age, chSex[0], weight, height);
            Persona person2 = new Persona(name, age, chSex[0]);
            Persona person3 = new Persona();

            person3.setNombre("Nombre venicio tercero");
            person3.setEdad(45);
            person3.setSexo('M');
            person3.setPeso(22.21);
            person3.setAltura(2.64);

            System.out.println("----------------------------------------------------------");
            System.out.println(person1.toString());
            if(person1.calcularIMC() == -1)  System.out.println("Esta persona esta por debajo del peso ideal");
            if(person1.calcularIMC() == 0)  System.out.println("Esta persona tiene un peso ideal");
            if(person1.calcularIMC() == 1) System.out.println("Esta persona tiene sobrepeso");

            if(person1.esMayorDeEdad() == true) System.out.println("Ademas es mayor de edad");
            else System.out.println("Ademas es NO mayor de edad");


            System.out.println("----------------------------------------------------------");
            System.out.println(person2.toString());
            if(person2.calcularIMC() == -1)  System.out.println("Esta persona esta por debajo del peso ideal");
            if(person2.calcularIMC() == 0)  System.out.println("Esta persona tiene un peso ideal");
            if(person2.calcularIMC() == 1) System.out.println("Esta persona tiene sobrepeso");
            if(person2.esMayorDeEdad() == true) System.out.println("Ademas es mayor de edad");
            else System.out.println("Ademas es NO mayor de edad");

            System.out.println("----------------------------------------------------------");
            System.out.println(person3.toString());
            if(person3.calcularIMC() == -1)  System.out.println("Esta persona esta por debajo del peso ideal");
            if(person3.calcularIMC() == 0)  System.out.println("Esta persona tiene un peso ideal");
            if(person3.calcularIMC() == 1) System.out.println("Esta persona tiene sobrepeso");
            if(person3.esMayorDeEdad() == true) System.out.println("Ademas es mayor de edad");
            else System.out.println("Ademas es NO mayor de edad");


            // Repetir programa
            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }


    /**
     * 17) Funcion que incorpora el punto 17, Creacion de clase Electrodomestico y 10 posiciones
     */
    static void option17() {
        boolean condition = true; // Bucle infinito

        // Condicion para repetir programa si el usuario desea
        while (condition) {
            double counterLavadora, counterElectro, counterTelevisor;
            counterLavadora = counterElectro = counterTelevisor = 0;


            Electrodomestico[] arrayElectro = new Electrodomestico[]{
                    new Electrodomestico(), new Electrodomestico(450, 50), new Television(40, false, 100, 20, "Blanco", 'A'),
                    new Television(80, true, 200, 40, "negro", 'F'), new Television(22, false, 150, 25, "Azul", 'B'),
                    new Television(19, true, 75, 35, "rojo", 'A'), new Lavadora(),
                    new Lavadora (450, 40), new Electrodomestico(), new Television()

            };

            for(Electrodomestico element: arrayElectro){
                System.out.println("Elemento" + element.precioFinal());
                System.out.println("-" + (String)(element.getClass().getCanonicalName().split("\\.")[2]) + "-");
                if (((String)element.getClass().getCanonicalName().split("\\.")[2]) == "Electrodomestico"){
                    System.out.println("asdasfsdffsdfsdfsd");
                    counterElectro += element.precioFinal();
                }
                if (((String)element.getClass().getCanonicalName().split("\\.")[2]) == "Lavadora"){
                    counterLavadora += element.precioFinal();
                }
                if (((String)element.getClass().getCanonicalName().split("\\.")[2]) == "Television"){
                    counterTelevisor += element.precioFinal();
                }
            }

            System.out.println("Total de Electrodomesticos:" + (counterElectro + counterTelevisor + counterLavadora) +
                    "\n Electrodomesticos individuales total: " + counterElectro +
                    "\n Lavadora total: " + counterLavadora +
                    "\n Televisor total: " + counterTelevisor);

            System.out.println("Repetir Programa? [Si/no]\n");
            if ( (compareInput("Choice")).equals("no")) condition=false;
        }
    }




    // ------------------------------------------------- COMPROBAR INPUT USUARIO --------------------------------------------------------------
    /**
     * Funcion para repetir input scanner hasta que se introduzca un tipo de dato valido
     * @param type = texto con el tipo de input scanner a evaluar y retornar
     * @return numero <int> o texto <String>
     */
    static Object compareInput(String type){
        // Comparar numeros
        if (type.equals("Int")){
            // Bucle infinito hasta que se reciba un numero
            while(!sc.hasNextInt()){
                System.out.println("?=Opcion no es un numero");
                sc.next();
            }
            return sc.nextInt(); // Retorno en forma de entero
        }

        // Comparar eleccion Y = Si -- n = No
        if (type.equals("Choice")){
            // Bucle infinito hasta que se reciba Y o n
            while(!sc.hasNext("Si") && !sc.hasNext("no")){
                System.out.println("?=Opcion no es Si/no");
                sc.next();
            }
            return sc.next(); // Retorno
        }

        // Comparar si next() String puede ser convertido a double
        if (type.equals("stringDouble")){
            // Bucle infinito
            while(!sc.hasNext("^\\d*\\.\\d+|\\d+\\.\\d*$") && !sc.hasNext("^\\d+|\\d*$")){
                System.out.println("?=Valor introducido no puede ser convertido a decimal");
                sc.next();
            }
            return sc.next(); // Retorno
        }

        // Comparar si next() es un <int> o <double>
        if (type.equals("intAndDouble")){
            // Bucle infinito hasta que se reciba un numero o decimal
            while(!sc.hasNextInt() && !sc.hasNextDouble()){
                System.out.println("?=Opcion no es un numero");
                sc.next();
            }
            return (sc.hasNextInt()) ? sc.nextInt() : sc.nextDouble(); // Retorno en forma de entero o decimal
        }

        // Comparar si input es un string
        if (type.equals("Sex")){
            // Bucle infinito hasta que se reciba un string sin espacios
            sc.useDelimiter("\n");
            return sc.next(); // Retorno en forma de entero o decimal
        }

        if (type.equals("StringSpace")){
            // Bucle infinito hasta que se reciba una cadena de texto
            sc.useDelimiter("\n");
            return sc.next();
        }


        return 0;
    }




    //-------------------------- MAIN INICIO PROGRAMA -----------------------------------------------------------------
    public static void main(String[] args) {
        boolean condition = true; // Bucle infinito
        String msjWelcome = "Programa con 18 opciones desarrollado en java\n" +
                "Porfavor introducir un numero entre 1-18 para entrar a la opcion deseada\n";

        // Opciones formateadas para mejor visualizacion de las 18 opciones
        String options = String.format("%s%63s\n%s%83s\n%s%56s\n%s%36s\n%s%60s\n%s%71s\n%s%78s\n%s%68s\n",
                "1-2) Mayor de dos numeros", "3) Area circulo",
                "4) Calcular IVA", "5-6) Impar y par de 1-100",
                "7) Ingresar numero y compararlo con 0", "8) Saber dia laboral",
                "9) \"Le sonrise sere le mejor erme contre le tristeze\" y frase adicional", "10) Eliminar espacios en una frase",
                "11) Contador de caracteres y vocales en una cadena de texto", "12) Comparar dos palabras y mostar diferencias",
                "13) Consultar hora actual (AAAA/MM/DD) (HH:MM:SS)", "14) Contador 2 en 2 hasta 1000, desde un numero",
                "15) Menu GESTION CINEMATOGRaFICA", "16) Clase Persona y 3 objetos Persona",
                "17) Crear Array de 10 objetos Electrodomesticos", "18) Series y peliculas");


        while (condition) {
            System.out.println(msjWelcome);
            System.out.println(options);

            int userOpt = (int) compareInput("Int"); // scanner para opcion principal
            switch (userOpt) {
                // Referirse a la documentacion interna de cada funcion para entender su objetivo
                case 1:
                case 2:
                    option1_2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                case 6:
                    option5_6();
                    break;
                case 7:
                    option7();
                    break;
                case 8:
                    option8();
                    break;
                case 9:
                    option9();
                    break;
                case 10:
                    option10();
                    break;
                case 11:
                    option11();
                    break;
                case 12:
                    option12();
                    break;
                case 13:
                    option13();
                    break;
                case 14:
                    option14();
                    break;
                case 15:
                    option15();
                    break;
                case 16:
                    option16();
                    break;
                case 17:
                    option17();
                    break;
                case 18:
                    option17();
                    break;
                default:
                    System.out.println("___Opcion invalida");
            }
        }

    }
}
