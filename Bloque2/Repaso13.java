public class Repaso13 {
    public static void main(String[] args) {
    /*
    Programa que pide un número y devuelve su factorial (el factorial, en matemáticas, 
    es el número multiplicado por todos los números menores que él, excepto el cero).
    */    
   int num1 = Integer.parseInt(System.console().readLine("Escribe tu numero: "));
   for(int i = num1; i > 0; i--){
    int multiplicacion = num1 * i;
    System.out.println(num1 + " x " + i + " = " + multiplicacion);
   }
    }
}
