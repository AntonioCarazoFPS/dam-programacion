public class Ejercicio6 {
    /*
    Desarrolla un programa que pida la edad al usuario y la mande a un método. El método comprobará si es mayor de edad o no, 
    y devolverá al main una frase que será "es mayor de edad" o "es menor de edad". El main imprimirá el resultado.
    */
    public static void main(String[] args) {
        int edad1 = Integer.parseInt(IO.readln("Escribe tu edad: "));
        System.out.println(verificacion(edad1));
    }
    static String verificacion(int n1){
        if (n1 >= 18) {
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }
}
