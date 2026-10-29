/**
 * machupin
 */
public class machupin {

    public static void main(String[] args) {
        int numero1 = 6;
        int numero2 = 9;
        int suma = numero1 + numero2;
        System.out.println("La suma da " + suma);
        int resta = numero1 - numero2;
        System.out.println("La resta da " + resta);
        saludar();
        //llamamos a la funcion
    }
    

    static void saludar(){
        //creamos otra funcion diferente a la main
        System.out.println("hola");
}
}