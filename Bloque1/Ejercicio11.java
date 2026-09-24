public class Ejercicio11 {
    public static void main(String[] args) {
        double euros1 = Double.parseDouble(System.console().readLine("Introduce el numero de euros que quieres convertir: "));
        //pedimos los euros por consola y lo guardamos en la variable double
        final double cambio1 = 1.15;
        //El final sirve para indicar que esa variable no va a cambiar
        //LOS DATOS QUE PODRIAN VARIAR SE GUARDA EN VARIABLES
        //LOS DATOS QUE NO VAN A VARIAR SE GUARDAN EN CONSTANTES
        double euroDollar = euros1 * cambio1;
        System.out.println(euros1 + "euros en dollar es " + euroDollar);
        //calculamos la conversion y lo enseñamos por la consola
    }
}
