public class Ejercicio5 {
    /*
    Crea un método calcularMedia que reciba tres notas y retorne la media de estas. En el main, 
    solicita las notas al usuario, llama al método para obtener la media, 
    y usa la media devuelta para mostrar un mensaje indicando si la persona ha aprobado o suspendido 
    (aprobado si la media es igual o superior a 5). Importante: la función solo calcula la media, comprobar si ha aprobado o no e imprimirlo es trabajo del main.
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(IO.readln("Escribe tu primera nota: "));
        int num2 = Integer.parseInt(IO.readln("Escribe tu segunda nota: "));
        int num3 = Integer.parseInt(IO.readln("Escribe tu tercera nota: "));
        media(num1, num2, num3);
        if (media(num1, num2, num3)>=5) {
            System.out.println("Esta aprobado");
        } else {
            System.out.println("Estas suspenso");
        }
    }
    static int media(int n1, int n2, int n3){
        int media = ((n1 + n2 + n3)/3);
        System.out.println("La media es " + media);
        return media;
    }
}
