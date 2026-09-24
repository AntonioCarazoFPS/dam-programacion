public class Ejercicio9 {
    public static void main(String[] args) {
        int numHoras = Integer.parseInt(System.console().readLine("Horas: "));
        int numDias = numHoras / 24;
        // Calculamos los dias, dividiendo por las 24h del dia
        System.out.println(numDias + " Dias");
        // Mostramos los dias
        int horasRestantes = numHoras % 24;
        /*
         * Se calcula el resto de la division esto puede ser especifico para int
         * Esto es para que podamos enseñar las horas ya que es lo que sobra de la
         * division
         */
        System.out.println(horasRestantes + " Horas");
        // Mostramos las horas
    }
}