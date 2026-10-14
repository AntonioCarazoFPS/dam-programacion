public class Ejercicio12 {
    public static void main(String[] args) {
        double precioProducto = Double.parseDouble(System.console().readLine("Escribe el precio de tu producto: "));
        String primeraNecesidad =System.console().readLine("Escribe si es de primera necesidad con si o no: ");
        final double necesidad = 0.10;
        final double iva = 0.21;
        switch (primeraNecesidad){
         case("si"):
            precioProducto = precioProducto + (precioProducto * necesidad);
            System.out.println("El precio de tu producto es: " + precioProducto);
            break;
        case("no"):
            precioProducto = precioProducto + (precioProducto * iva);
            System.out.println("El precio de tu producto es: " + precioProducto);
            break;
       }
}
}
