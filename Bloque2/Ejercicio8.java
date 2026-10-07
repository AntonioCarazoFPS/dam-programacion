public class Ejercicio8 {
    public static void main(String[] args) {
        int ancho = Integer.parseInt(System.console().readLine("Escribe el ancho de tu bandera"));
        int alto = Integer.parseInt(System.console().readLine("Escribe el alto de tu bandera"));
        int cmCuadrado = ancho * alto;
        int costeBandera = cmCuadrado * 2;
        int banderaEuro = costeBandera / 100;
        int banderaCentimo = costeBandera % 100;
        //creamos las variables
        int bordado = Integer.parseInt(System.console().readLine("Quieres bordado responde 0 o 1"));
        
        if (bordado == 0) {
            System.out.println("No hemos añadido bordado");
        } else if (bordado == 1) {
            System.out.println("Hemos añadido el bordado");
            banderaEuro = banderaEuro + 2;
            banderaCentimo = banderaCentimo + 50;
        } //preguntamo si quiere escudo bordado
        int envio = Integer.parseInt(System.console().readLine("Quieres que se te envio o prefieres recogerlo responde 0 o 1 "));
        if (envio == 0) {
            System.out.println("No hemos añadido envio");
        } else if (envio == 1) {
            System.out.println("Hemos añadido el envio");
            banderaEuro = banderaEuro + 5;
        }
        System.out.println("Tu bandera cuesta " + banderaEuro + " euros y " + banderaCentimo + " cent");            
    }
}

