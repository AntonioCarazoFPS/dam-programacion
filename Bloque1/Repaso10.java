public class Repaso10 {
    public static void main(String[] args) {
        String nombre = "Adrian Alcantara";
        long numeroTarjeta = 30000482917L;
        char tipoTarjeta = 'G';
        int saldoCent = 1000;
        int viajesMes = 0;
        final int precioViaje = 140;
        //creamos las variables que nos dan
        System.out.println("Nombre: " + nombre + " Numero de tarjeta:  " + numeroTarjeta + " Tipo de tarjeta: " + tipoTarjeta);
        System.out.println("Saldo actual: " + saldoCent + " Viajes de este mes: " + viajesMes);
        //Mostramos por consola los datos del usuario
        viajesMes++;
        saldoCent-=140;
        viajesMes++;
        saldoCent-=140;
        viajesMes++;
        saldoCent-=140;
        //calculamos los viajes
        saldoCent+=500;
        //calculamos la recarga
        System.out.println("Saldo actual: " + saldoCent + " Numero de viajes: " + viajesMes);
        //mostramos por consola el nuevo saldo y los viajes
        int restoViaje = saldoCent / precioViaje;
        //calculamos cuantos viajes sobran
        System.out.println("Te quedan para: " + restoViaje + " viajes");
        //mostramos la cantidad de viajes que sobran
    }
}
