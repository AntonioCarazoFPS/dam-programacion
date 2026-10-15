public class Ejercicio26 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            String frase = System.console().readLine("Escribe una frase: ");
            if (frase.equals("STOP")){;
            }else if (frase.equals("No repitas")) {
                continue;
                //no le lo que hay abajo y sigue con el bucle
            }
            System.out.println(frase);
            break;
            //finaliza el bucle
        }
    }
}
