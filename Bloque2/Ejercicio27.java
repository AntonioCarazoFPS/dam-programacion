public class Ejercicio27 {
    public static void main(String[] args) {
        String contraseña = System.console().readLine("Escribe tu contraseña");
        for(int i = 1; i <= 3; i++){
            String intento = System.console().readLine("Escribe de nuevo tu contraseña para entrar: ");
            if (intento.equals(contraseña)) {
                System.out.println("Has acertado");
                break;
            }
        }
    }
}
