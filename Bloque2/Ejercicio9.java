public class Ejercicio9 {
    public static void main(String[] args) {
        double precioProducto = Double.parseDouble(System.console().readLine("Escribe el precio de tu producto: "));
        boolean primeraNecesidad = Boolean.parseBoolean(System.console().readLine("Escribe si es de primera necesidad con true o false: "));
        final double necesidad = 0.10;
        final double iva = 0.21;
        if ( primeraNecesidad == true) {
            precioProducto = precioProducto + (precioProducto * necesidad);
            System.out.println("El precio de tu producto es: " + precioProducto);
        }else if ( primeraNecesidad == false) {
            precioProducto = precioProducto + (precioProducto * iva);
            System.out.println("El precio de tu producto es: " + precioProducto);
        }
    }
}
