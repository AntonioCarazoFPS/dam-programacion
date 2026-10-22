public class Repaso3 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(System.console().readLine("Escribe un numero: "));
        int numPar = 0;
        int numImpar = 0;
        for(int i = 0; i <= num1; i++){
            if (i%2==0){
            numPar = numPar + i;
            } else if (i%2!=0) {
            numImpar = numImpar + i;  
            }
        }
        System.out.println("pares "+numPar);
        System.out.println("impares "+numImpar);
    }
}
