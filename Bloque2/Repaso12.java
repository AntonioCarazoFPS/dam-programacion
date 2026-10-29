public class Repaso12 {
    public static void main(String[] args) {
        /*
        Escribe un programa que permita ir introduciendo una serie indeterminada 
        de números mientras que la suma de todos ellos no supere el valor 1000. 
        Cuando esto último ocurra, se debe mostrar el total acumulado (suma de todos los introducidos), 
        el contador de los números introducidos y la media.
         */
        int num1 = 0;
        int total = 0;
        int contador = 0;
        int media = 0;
        while (total < 1000) {
            num1 = Integer.parseInt(System.console().readLine("Escribe tu numero: "));
            total = total + num1;
            contador++;

        }
        System.out.println("Total acumulado: " + total);
        System.out.println("Numeros introducidos: " + contador);
        media = total / contador;
        System.out.println("Media de los numeros: " + media);
    }
}
