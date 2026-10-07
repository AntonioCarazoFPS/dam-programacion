public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Escribe tu numero: "));
        int parImpar = numero % 2;
        if (parImpar == 0) {
            System.out.println("Es par");
        } else if (parImpar == 1) {
            System.out.println("Es impar");
        }
    }
}
