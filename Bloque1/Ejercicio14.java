public class Ejercicio14 {
    public static void main(String[] args) {
        double dineroActual = Double.parseDouble(System.console().readLine("Escribe tu dinero actual: "));
        //Pide por consola el dinero que hay en la cuenta
        double dineroIngreso = Double.parseDouble(System.console().readLine("Escribe el dinero que quieres ingresar: "));
        dineroActual = dineroActual + dineroIngreso;
        //Preguntamos el dinero de ingreso y lo sumamos 
        double dineroPedir = Double.parseDouble(System.console().readLine("Escribe el dinero que quieres retirar: "));
        //preguntamos el dinero que quiere retirar
        dineroActual = dineroActual - dineroPedir;
        //calculamos el dinero actual
        System.out.println("Tienes en la cuenta: " + dineroActual);
        //lo mostramos por consola
    }
}
