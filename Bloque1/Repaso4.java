public class Repaso4 {
    public static void main(String[] args) {
        String plato = "Lentejas de la abuela";
        double glentejas = 250;
        double gchorizo = 150;
        int numZanahoria = 2;
        double lAgua = 1;
        boolean vegetariano = false;
        //creamos las variables que vamos a necesitar
        int comensales = Integer.parseInt(System.console().readLine("comensales que van a comer hoy? "));
        //pedimos por consola el numero de comensales
        System.out.println("El plato a realizar es: " + plato);
        double lentejasFinal = glentejas * comensales;
        double chorizoFinal = gchorizo * comensales;
        int zanahoriaFinal = numZanahoria * comensales;
        double aguaFinal = lAgua * comensales;
        //calculamos la cantidad de comida que necesitamos
        System.out.println("Necesitamos:  " + lentejasFinal + " gramos de lentejas, " + chorizoFinal + " gramos de chorizo, " + zanahoriaFinal + " zanahoria y " + aguaFinal + "L " );
        System.out.println("Es apto para vegetariano: " + vegetariano);
        System.out.println("Numero de comensales para la receta: " + comensales);
        //ahora mostramos todo los que nos pide por consola
    }
}
