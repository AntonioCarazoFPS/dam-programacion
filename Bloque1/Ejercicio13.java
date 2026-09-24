public class Ejercicio13 {
    public static void main(String[] args) {
        String nombreProducto = System.console().readLine("Escribe el nombre del producto: ");
        //Pedimos por consola el nombre del producto
        double precioProducto1 = Double.parseDouble(System.console().readLine("Escribe el precio del producto: "));
        //Pedimos por consola el precio del procucto
        final double IVA = 1.21;
        //Creamos la variable final del IVA
        double productoIva1 = precioProducto1 * IVA;
        System.out.println("Tu/s " + nombreProducto + " con IVA es: " + productoIva1); 
        //Calculamos el IVA y lo ponemos por consola
    }
}
