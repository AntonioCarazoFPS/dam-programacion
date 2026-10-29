public class Repaso10 {
    public static void main(String[] args) {
        /*
        Programa que pide un número al usuario, y pinta un cuadrado de asteriscos por consola, 
        de lado el número que ha dicho el usuario. Por ejemplo, si el usuario introduce un 5, 
        el programa mostrará por consola:
         */
        int cantidad = Integer.parseInt(System.console().readLine("Escribe la cantidad de asteriscos que quieres introducir: "));
        int filas = 0;
        while (cantidad != filas) {
            for(int i = 0; i < filas; i++){
                System.out.print("*");
            }
            System.out.println("");
            cantidad++;
        }
    }
}
