public class Apuntes1 {

    public static void main(String[] args) {
        int numero1 = 6;
        int numero2 = 9;
        saludar();
        //llamamos a la funcion TIPO1
        sumar(numero1, numero2);
        //mandamos dos variables numeros a la funcion sumar TIPO2
        int resultadoResta = restar(numero1, numero2);
        //creamos una variable en main mandamos el numero 1 y el numero a otra funcion y recibimos restar de la funcion TIPO 3
        System.out.println("La resta da " + resultadoResta);
        System.out.println(generarAleatorio() );
    }
    //Tipo 1 de funcion: static void nombrefuncion(){}
    
    static void saludar(){
        //creamos otra funcion diferente a la main
        String nombre = IO.readln("Como te llamas? ");
        //io es lo mismo que system.console, es algo nuevo de java
        System.out.println("hola " + nombre);
    }
    //Tipo 2 de funcion: static void  sumar(int n1,int n2){}
    static void  sumar(int n1,int n2){
        //creamos una funcion la cual recibe los numeros de main
        int suma = n1 + n2;
        //se hace la suma de los dos numeros recibidos
        System.out.println("La suma da " + suma);
        
    }
    //Tipo 3 de funcion (con retorno):
    static int  restar(int n1, int n2){
        //Ponemos int porque es lo que vamos a mandar al main
        int resta = n1 - n2;
        return resta;
        //devuelve un dato. ATENCION AHI QUE PONER EL TIPO DE VARIABLE EN STATIC
        
 }
 static int generarAleatorio(){
    int aleatorio = (int)(Math.random()*11);
    return  aleatorio;
 }
}