public class Ejercicio16 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(System.console().readLine("Escribe tu peso: "));
        double altura = Double.parseDouble(System.console().readLine("Escribe tu altura: "));
        double IMC = peso / (altura * altura);
        System.out.println("El IMC es " + IMC);
    }
}
