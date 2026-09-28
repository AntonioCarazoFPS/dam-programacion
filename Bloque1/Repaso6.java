public class Repaso6 {
    public static void main(String[] args) {
        String nombreApellido = "Luis Gutierrez";
        int dorsal = 3264;
        char categoria = 's';
        boolean federado =  true;
        double kmRecorrido = 10.5;
        int segundos = 3150;
        //creamos las variables con la informacion necesaria
        System.out.println("Nombre y apellido: " + nombreApellido + " Dorsal: " + dorsal + " Categoria: " + categoria);
        System.out.println("Esta federado: " + federado);
        //mostramos por consola los datos del corredor
        int minutos = segundos / 60;
        //calculamos los minutos
        int segundosFinal = segundos % 60;
        //calculamos los segundos finales tras pasarlo todo a minutos
        int hora = minutos / 60;
        //calculamos las horas
        int minutosFinal = minutos % 60;
        //calculamos los minutos que sobran
        System.out.println("El tiempo que ha tardado es " + hora + "h " + minutosFinal + "min " + segundosFinal + "s");
        //mostramos por con sola el tiempo en horas, minutos, segundo
        double velocidad = segundos / kmRecorrido;
        //calculamos la velocidad
        System.out.println("Tiempo medio por km: " + velocidad);
    }
}