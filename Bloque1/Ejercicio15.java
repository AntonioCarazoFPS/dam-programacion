public class Ejercicio15 {
    public static void main(String[] args) {
        final double formula1 = 273.15;
        double grados1 = Double.parseDouble(System.console().readLine("Escribe los grados centigrados: "));
        double kelvin = grados1 + formula1;
        System.out.println("Los grados kelvin son: " + kelvin);
    }
}
