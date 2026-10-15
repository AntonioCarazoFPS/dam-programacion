public class Ejercicio29 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Escribe el numero en el que quieres parar: "));
        for(int i = 0; i <= 100; i++){
            if (num1 == i) {
                continue;
            }
            System.out.println(i);
        }
    }
}
