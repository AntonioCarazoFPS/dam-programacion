public class Ejercicio17 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*6)+1;
        System.out.println("Dado 1 : " + num1);
        int num2 = (int) (Math.random()*6)+1;
        System.out.println("Dado 2 : " + num2);
        int num3 = (int) (Math.random()*6)+1;
        System.out.println("Dado 3 : " + num3);
        int suma = num1 + num2 + num3;
        System.out.println("Suma de los numeros: " + suma);
    }
}
