public class Ejercicio12 {
    public static void main(String[] args) {
        int personas1 = Integer.parseInt(System.console().readLine("Numero de personas que van a comer: "));
        int trozos1 = Integer.parseInt(System.console().readLine("Numero de trozos que hay: "));
        //Pedimos por consola el numero de trozos y de personas
        int tocanPersona = trozos1 / personas1;
        //Calculamos a cuantos trozos toca cada persona
        int sobra = trozos1 % personas1;
        //Calculamos cuantos trozos sobran
        System.out.println("Cada persona toca a " + tocanPersona + " trozos  y sobran " + sobra + " trozos");
        //Lo mostramos por consola
    }
}
