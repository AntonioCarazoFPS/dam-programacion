public class Repaso9 {
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
        El programa, al finalizar debe informar de cuántos números introducidos son mayores que 100, 
        cuántos menores que 100 y cuántos iguales a 100.
         */
        int cantidadNum = Integer.parseInt(System.console().readLine("Escribe la cantidad de numeros que deseas introducir: "));
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        for(int i = 1; i <= cantidadNum; i++){
            int num1 = Integer.parseInt(System.console().readLine("Escribe el numero: "));
            if(num1 < 100){
                menor++;
            } else if (num1 > 100){
                mayor++;
            } else if (num1 == 100){
                igual++;
            }
        }
        System.out.println("Mayores que 100: " + mayor + " Menores de 100: " + menor + " Iguales a 100: " + igual);
}
}
