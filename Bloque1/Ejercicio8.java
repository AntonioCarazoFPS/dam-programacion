public class Ejercicio8 {
    public static void main(String[] args) {
        // main para creas
        int numero1 = Integer.parseInt(System.console().readLine("Añade un numero: "));
        int numero2 = Integer.parseInt(System.console().readLine("Añade otro numero: "));
        // Pido los numeros Int
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        // Hacemos los calculos
        double division = (double)numero1 / (double)numero2;
        /* Hacemos que lo lea como una variable double 
        (Ya que de normal saldria mal porque son dos int)
         y hacemos la division con un double*/ 
        System.out.println("La suma de los numeros es: " + suma + " La resta de estos numeros es: " + resta
                + " La multiplicacion es: " + multiplicacion + " La division es: " + division);
        // La proxima vez hacer varios system
    }
}
