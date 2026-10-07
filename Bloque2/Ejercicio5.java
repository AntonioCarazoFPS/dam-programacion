/**
 * Ejercicio5
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double nota = Double.parseDouble(System.console().readLine("Escribe tu nota:"));
        //creamos la variable nota por consola
        if (nota >= 0 && nota < 5) {
            System.out.println("Su nota es insuficiente");
            //creamos un if y comparamos por dos factores, va variando segun la nota que haya puesto
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Su nota es suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Su nota es un bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Es un notable");
        }else if (nota >= 9 && nota < 10) {
            System.out.println("Es un sobresaliente");
        } else{
            System.out.println("La nota introducida esta fura de rango");
            //creamos esto por que es posible que pongan un numero como 10.99
        }

    }
}