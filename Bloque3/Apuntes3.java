public class Apuntes3 {
    public static void main(String[] args) {
        saludar("Ana");

    }
    //reclusividad se llama cuando una funcion se llama a ella misma
    static void saludar(String n){
        System.out.println("Hola " + n);
        saludar(n);
    }
}
