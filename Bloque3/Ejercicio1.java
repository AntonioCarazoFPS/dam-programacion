public class Ejercicio1 {
/* Crea un programa cuyo main pregunte 2 números al usuario y se los pase a los siguientes métodos:

Un método para sumarlos.
Un método para restarlos..
Un método para multiplicarlos.
Un método para dividirlos.
Atención:

Sumar y restar deben imprimir directamente por consola.
Multiplicar y dividir devuelven el resultado a main, y main los muestra por consola.*/
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(IO.readln("Escribe tu primer numero: "));
        int numero2 = Integer.parseInt(IO.readln("Escribe tu segundo numero: "));
        sumar(numero1, numero2);
        restar(numero1, numero2);
        System.out.println(multiplicar(numero1, numero2));
        System.out.println(dividir(numero1, numero2));
    }
    static void sumar(int n1, int n2){
        int suma = n1 + n2;
        System.out.println("Su suma es " + suma); 
    }
    static void restar(int n1, int n2){
        int resta = n1 - n2;
        System.out.println("Su resta es " + resta); 
    }
    static int multiplicar(int n1, int n2){
        int multiplicar = n1 * n2;
        return multiplicar;
    }
    static int dividir(int n1, int n2){
        int dividir = n1 / n2;
        return dividir;
    }
    }