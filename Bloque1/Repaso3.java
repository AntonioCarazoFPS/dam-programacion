public class Repaso3 {
    public static void main(String[] args) {
        String nombre = "Huevos Manuel";
        long numeroSanitario = 9584828294L;
        char tamano = 'M';
        boolean ecologico = false;
        int huevos = 4546;
        //creamos las variables necesarias
        int hueveras = huevos / 12;
        int sobraHuevos = huevos % 12;
        //hacemos el calculo de reparto, sacando la cantidad hueveras y cuantos huevos sobras
        final double precio = 2.35;
        double precioFinal = hueveras * precio;
        //calculamos cuanto ganamos con la hueveras
        System.out.println(nombre + " numero sanitario :" + numeroSanitario);
        System.out.println("Huevos de la talla: " + tamano);
        System.out.println("Ecologicos: " + ecologico);
        System.out.println("Se ha recoggido y vendido un total de " + hueveras + " hueveras llenas");
        System.out.println("Se ha ingresado " + precioFinal + " euros");
        System.out.println("Han sobrado " + sobraHuevos + " huevos");
        //hacemos que se muestre todo por consola
    }
}
