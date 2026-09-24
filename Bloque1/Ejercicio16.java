public class Ejercicio16 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(System.console().readLine("Escribe tu peso: "));
        //pedimos el peso por consola como double
        double altura = Double.parseDouble(System.console().readLine("Escribe tu altura: "));
        //pedimos el altura por consola como double
        double IMC = peso / (altura * altura);
        //calculamos el IMC
        System.out.println("El IMC es " + IMC);
        //lo mostramos por consola
    }
}
