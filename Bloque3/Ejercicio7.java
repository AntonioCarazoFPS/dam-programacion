public class Ejercicio7 {
    /*
    Desarrolla un programa que pida un número al usuario y se lo pase a un método. 
    El método comprobará si el número es positivo, negativo o cero, y enviará una respuesta en formato String al main. 
    El main muestra el resultado.
    */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(IO.readln("Escribe un numero: "));
        System.out.println(comprobacion(num1));
    }
    static String comprobacion(int n1){
        if(n1 > 0){
            return "Es positivo";
        } else if (n1 < 0){
            return "Es negativo";
        } else{
            return "Es cero";
        }
    }
}
