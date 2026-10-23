public class Repaso7 {
    public static void main(String[] args) {
        /*
        El mayor y el menor. El programa pregunta cuántos números se van a introducir,
         los pide uno a uno y al terminar muestra cuál ha sido el mayor y cuál el menor.
        */
       int numerosIntroducido = Integer.parseInt(System.console().readLine("Escribe la cantidad de numero que quieres introducir: "));
       int mayor = 0;
       int menor = 100000000;
       int numero = 0;
       for(int i = 1; numerosIntroducido >= i ; i++){
        numero = Integer.parseInt(System.console().readLine("Introduce un numero: "));
        if (numero < menor) {
            menor = numero;
        } else if (numero > mayor) {
            mayor = numero;
        }
       }
       System.out.println("El numero mayor fue: " + mayor + " y el numero menor: " + menor);
    }
}
