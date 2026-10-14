public class Ejercicio14 {
    public static void main(String[] args) {
        String felicitacion = System.console().readLine("Escribe si quieres que te felicite tu santo, cumple o aniversario (Escribelo igual por consola): ");
        switch (felicitacion){
            case "santo":
                String nombre = System.console().readLine("Escribe tu nombre: ");
                System.out.println("Feliz San " + nombre);
                break;
            case "cumple":
                int edad = Integer.parseInt(System.console().readLine("Escribe tu nombre: "));
                System.out.println("Feliz " + edad + " cumpleaños");
                break;
            case "aniversario":
                String acto = System.console().readLine("Escribe tu celebracion: ");
                System.out.println("Feliz aniversario de  " + acto);
                break;

        }
    }
}
