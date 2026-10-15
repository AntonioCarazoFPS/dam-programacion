public class Ejercicio28 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Escribe el numero en el que quieres parar: "));
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        if (num1 == i) {
            break;
        }
        }
    }
}
