public class Ejercicio15 {
    public static void main(String[] args) {
        final double formula1 = 273.15;
        //creamos la formula como final lo que significa que es un valor fijo
        double grados1 = Double.parseDouble(System.console().readLine("Escribe los grados centigrados: "));
        //pedimos por consola los grados
        double kelvin = grados1 + formula1;
        //calculamos los kelvin con la formula
        System.out.println("Los grados kelvin son: " + kelvin);
        //lo muestro por consola
    }
}
