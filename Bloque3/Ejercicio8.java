public class Ejercicio8 {
    /*
    Programa que comprueba si un número introducido por el usuario, es uno de los premiados en la lotería o no. 
    El programa pide al usuario su número, y se lo pasa a un método que tiene guardados en variables los 3 números premiados.
     El método comprueba si está premiado o no (si coincide o no con alguno de los 3 guardados) y 
     devuelve al main la frase “premiado!!” o “no ha habido suerte”. El main muestra la frase por consola.
    */
    public static void main(String[] args) {
        int numUsuario = Integer.parseInt(IO.readln("Escribe tu numero de decimo: "));
        System.out.println(premiado(numUsuario));
    }
    static String premiado(int n1){
        int premio1 = 32213;
        int premio2 = 74626;
        int premio3 = 20453;
        if (n1 == premio1 || n1 == premio2 || n1 == premio3) {
            return "premiado!!";
        } else{
            return "no ha habido suerte";
        }
    }
}
