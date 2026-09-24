public class Repaso2 {
    public static void main(String[] args) {
        int minutosParking = Integer.parseInt(System.console().readLine("Escribe el numero de minutos que has dejado el coche: "));
        //pedimos por consola el numero en minutos que ha estado
        final double minutoPagar = 0.045;
        //ponemos como variable la cual no cambia cuanto vale el minuto de parking
        double deuda = minutosParking * minutoPagar;
        //calculamos lo que tiene que pagar
        int horas = minutosParking / 60;
        //calculamos la horas diviendo entre 60
        int minutos = minutosParking % 60;
        //calculamos los minutos, cogiendo el resto
        System.out.println("Has estado: " + horas + " horas y " + minutos + " debes, " + deuda +" euros");
        //mostramos por consola la factura
    }
}
