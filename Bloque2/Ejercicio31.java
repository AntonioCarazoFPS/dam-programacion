public class Ejercicio31 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*99)+1;
        int num2 = 0;
        do {
            num2 = Integer.parseInt(System.console().readLine("Escribe un numero del 1 al 100: "));
            if (num1 > num2) {
                System.out.println("El numero es mayor");
            } else if (num1 < num2) {
                System.out.println("El numero es menor");
            }
        } while (num2 != num1);
        System.out.println("Acertastes");
    }
}
