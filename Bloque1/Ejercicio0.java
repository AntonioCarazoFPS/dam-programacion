package Bloque1;

public class Ejercicio0 {
    public static void main(String[] args) {
        //main es la abreviacion para poner public static
        String nombre = System.console().readLine("Como te llamas?");
        //Pregunta por consola y guarda en la variable nombre el nombre que hemos puesto por consola
        int edad = 19;
        /* Variables (Sirve para guardar datos) 
            Tipos:
                -Un caracter = char
                -Varios caracteres = string
                -Numero entero = int
                -Numero decimal = float o double*/
        System.out.println(nombre + " tiene " + edad + " años");
        //Imprimimos por consola (Sout es la abreviviacion)

    }
}