public class Repaso5 {
    public static void main(String[] args) {
        String nombreRestaurante = "100Montaditos";
        int mesa = 7;
        String importe = "86.40";
        int comensales = 4;
        boolean tarjeta = true;
        final double extraTarjeta = 0.05;
        //creamos la variables que necesitamos
        double importeCuenta = Double.parseDouble(importe);
        double pagarTarjeta = importeCuenta + (importeCuenta * extraTarjeta);
        double pagoComensal = pagarTarjeta / comensales;
        //hacemos las cuentas
        int eurosComensal = (int) pagoComensal;
        int centimosComensal = (int)((pagoComensal - eurosComensal)*100);
        //el (int) sirve para convertir un double en int
        System.out.println(nombreRestaurante);
        System.out.println("Mesa: " + mesa);
        System.out.println("Total si pagas sin tarjeta " + importe);
        System.out.println("Total si pagas con tarjeta " + pagarTarjeta);
        System.out.println("Se paga con tarjeta: " + tarjeta);
        System.out.println("Importe por comensal: " + eurosComensal + " euros y  " + centimosComensal + " cent");
        //mostramos por consola la informacion, como si fuera una factura
    }
}
