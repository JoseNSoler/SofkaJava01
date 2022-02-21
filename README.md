
# Java: Taller Practico de 18 puntos

<p align="center">
<img src="https://www.sofka.com.co/wp-content/uploads/2021/02/sofkau-logo-horizontal.png">
</p>
<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
</p>
<p align="center">
  <img src="https://img.shields.io/github/v/release/JoseNSoler/PracticaMVC?style=flat-square"
</p>   

## Descripcion General

Projecto - Repositorio con el proposito de practicar los conceptos básicos aprendidos y estudiados en el módulo de Desarrollo de Software en Java. El codigo se ejecuta y recibe todos los parametros por medio de la consola de comandos (cmd Windows - terminal shell Linux).
Al final de cada opcion, se preguntara si se desea repetir la opcion seleccionada (Solo respuestas Si/no) - Tambien para detener el programa se debe introducir -1

<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154841701-31f2e9f8-bb30-4874-8cc2-a48d32387eee.png">
  </p>

La logica del codigo se encuentra contenida en el archivo src/main/java/Program/StartPoint, y se encuentra dividido de la siguiente manera:
```Java
// Ejercicios propuestos, 18 metodos consecutivos
↓
// Validador Input
↓
// Main-Inicio del programa
```
- La primera parte se compone de una **seccion extensa compuesta de 18 metodos** los cuales implementan la logica requerida por los ejercicios propuestos
- El validador input verifica que toda la informacion proporcionada por teclado por el usuario, sea del **tipo requerido**. Ej:* Una funcion que suma dos numeros, solo podra recibir input numerico-decimal, de lo contrario **repetira** la peticion de datos hasta que esta reciba el tipo de dato esperado*
- El Main-inicio de programa, contiene el metodo `public static void main(String[] args)`, el cual ejecuta el menu principal de opciones-ejercicios



## Ejercicios propuestos
1.  Declarar 2 variables numéricas he indicar cual es mayor de los dos. Si son iguales indicarlo también.
2. Al ejercicio anterior se agrega entrada por consola de dos valores e indicar si son mayores, menores o iguales.
   *Para la opcion 1, el programa pedira introducir 1 si se desea comparar dos numeros aleatorios, O por el contrario 2 para despues introducir manualmente dos numeros*
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154840993-4e5518e5-9509-4919-969c-756eaeec4441.png">
</p>
<hr>
3. Calcular el área de un circulo(pi x R2).  El radio se pedirá por teclado
   *El valor del radio puede ser un numero decimal o entero*
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154841133-06ee3d2d-f849-4f42-91e0-8241a87ce815.png">
</p>
<hr>
4. Calcular el IVA(21%) de un precio. Se pedira por teclado el precio
   *El valor del precio puede ser un numero decimal o entero*
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154841996-70e0efff-99fa-47ce-98bc-d55af4333fbd.png">
</p>
<hr>
5. Muestra los números impares y pares del 1 al 100.
6. Ejercicio anterior realizado con un ciclo for.
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154842212-7ac19659-4c04-44c4-96e9-ccbc30e2cf04.png">
</p>
<hr>
7. Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154865922-9cb243c5-737f-48db-a1b4-dbc42307c7a5.png">
</p>
<hr>
8. Aplicación por consola que pide un día de la semana y nos indica si es un día laboral o no.
*Solo se admitiran datos por consola de tipo String, el dia de la semana debe tener la primera letra en mayuscula y el resto en minusucula (Sin acentos ni caracteres especiales. Ej: Lunes, Domingo, Miercoles)*
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866050-de1fa4b3-77dc-4097-94a6-98a5e51c401e.png">
</p>
<hr>
9. Del texto,“La sonrisa sera la mejor arma contra la tristeza”Se reemplaza todas las `a` del String anterior por una `e`, adicionalmente se concatenara una frase pedida por consola de tipo String al final de esta
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866300-bae62369-bd9d-4e50-b64e-b66a97e6c3bc.png">
</p>
<hr>
10. Metodo que pide por consola una oracion (que incluya espacios), y elimina todos los caracteres de tipo `espacio`
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866218-120e559b-3b30-402d-83a2-4fa6d784a546.png">
</p>
<hr>
11. Algoritmo que permite de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta misma, adicionalmente cuantas vocales tiene de `a,e,i,o,u`.
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866367-53ea5301-686c-4c16-bafb-f31c7bed6bf6.png">
</p>
<hr>
12. Aplicacion que pide por consola dos palabras, luego indica si son iguales, sino no son iguales mostrara sus diferencias.
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866502-8d7cf4bc-34c9-4de6-be25-da6fac3d7692.png">
</p>
<hr>
13. Algoritmo que permita consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866542-c88783f7-1950-4bb6-a252-3fcf1e626f7b.png">
</p>
<hr>
14. Metodo que pide un numero por consola y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866803-bbe2b5ee-b9c6-45a0-bee0-aba07bd022a3.png">
</p>
<hr>
15. Programa que muestre el siguiente menú de opciones
<p align="center">
  <img src="https://user-images.githubusercontent.com/59320487/154866893-1657c9e1-9a84-4cee-b1bd-0e618078790f.png">
</p>
*El sistema solo va a salir cuando se digite el numero 8, mientras se digite una de las cinco opciones se seguira mostrando el menu y si el usuario digita un numero que no esta en el menu se debe arrojar un mensaje " opcion incorrecto".Y mostrar el menu nuevamente.*
<hr>
16. Creacion clase llamada Persona que siga las siguientes condiciones:

- Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
- Se implantarán varios constructores:
  - Un constructor por defecto.
  - Un constructor con el nombre, edad y sexo, el resto por defecto.
  - Un constructor con todos los atributos como parámetro.
- Se implementaran estos metodos:
  - calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
  - esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
  - comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
  - toString(): devuelve toda la información del objeto.
  - generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
  - Métodos set de cada parámetro, excepto de DNI.
  
