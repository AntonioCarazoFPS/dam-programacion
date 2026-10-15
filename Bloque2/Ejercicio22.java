public class Ejercicio22 {
    public static void main(String[] args) {
        String frase = System.console().readLine("Escribe una pregunta: ");
        int num1 = Integer.parseInt(System.console().readLine("Escribe cuantas veces lo quieres repetir: "));
        for(int i = 0 ; i<num1; i++ ){
            System.out.println(frase);
        }
    }
}
