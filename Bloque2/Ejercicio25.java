public class Ejercicio25 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Escribe tu numero: "));
        for(int i = 2; i <= num1; i++ ){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
