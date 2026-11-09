public class Apuntes2 {
    //sobrecarga de funciones
    public static void main(String[] args) {
        System.out.println("La suma da: " + sumar(8, 2));
    }
    static int sumar(int n1, int n2){
        return n1+n2;
    }
    static double sumar(double n1, double n2){
        return n1+n2;
    }
    static double sumar(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
