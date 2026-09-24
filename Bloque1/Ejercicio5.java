public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = "Faustino";
        double precioTren = 27.3;
        int numeroBillete = 2;
        //creamos las variables que nos pide el ejercicio
        double factura = precioTren * numeroBillete;
        //hacemos una multiplicacion para saber cuanto dinero ha de pagar la persona
        System.out.println("Hola " + nombre + " lo/s " + numeroBillete + " billetes que comprastes salen por " + factura
                + " ya que el billete individual sale por " + precioTren);
        //hacemos que muestre la factura por la consola
    }
}
