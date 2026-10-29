public class Ejercicio2 {
    /*
    Desarrolla un programa que pida un número al usuario, 
    e imprima "hola" el número de veces que el usuario haya dicho.
     En el main se pide el número y se le pasa a un método. 
     El método imprime hola las veces que se le hayan especificado.
    */
    public static void main(String[] args) {
       int numeroReps = Integer.parseInt(IO.readln("Escribe las repeticiones: "));
       hola(numeroReps);
    }
    static void hola(int n1){
        for(int i = 1; i <= n1; i++){
            System.out.println("Hola");
        }

    }
        
    }

