public class Repaso1 {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellidos = "Gomez Perez";
        //ponemos nombre y apellidos como string
        long carne = 363526462721L;
        //ponemos long para el carne
        char categoria = 'A';
        //ponemos como char si es adulto o joven
        boolean multas = true;
        //ponemos como boolean para las multas
        int librosPrestados = 3;
        //creamos la variable int para los libros prestado
        int diasRetraso = 5;
        //creamos la variable int para los dias con retraso
        final double multa = 0.20;
        //creamos la variable multa como final ya que su valor no va a cambiar
        int cantidadMultas = librosPrestados * diasRetraso;
        //calculamos la cantidad de multas que debe de pagar
        double deuda = cantidadMultas * multa;
        //y calculamos la multa en dinero
        System.out.println(nombre + " " + apellidos + " numero de carne: " + carne);
        System.out.println("Categoria: " + categoria);
        System.out.println("Tiene multa: " + multas);
        System.out.println("Libros prestados: " + librosPrestados);
        System.out.println("Dias con retraso " + diasRetraso);
        System.out.println("Multa pendiente: " + deuda + " euros");
        //hacemos que se muestre en pantalla el informe
    }
}
