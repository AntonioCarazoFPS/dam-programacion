public class Ejercicio32 {
    public static void main(String[] args) {
        String vocal = "";
        int i = 0;
        while (!vocal.equals("0")) {
           vocal = System.console().readLine("Escribe tu caracter: ");
           if(vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")){
            i++;
           }
        }
        System.out.println("Has anotado " + i + " vocales");
    }
}
