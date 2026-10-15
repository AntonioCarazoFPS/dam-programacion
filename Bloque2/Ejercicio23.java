public class Ejercicio23 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("Escribe tu edad?"));
        for(int i = 0; i<=edad; i++){
            System.out.println("Tuvistes estos años: " + i);
        }
        //creamos un for y creamos la variable i, decimos que mientra i sea menor o igual a edad se realice el bucle
        //y para terminar que el incremento sea de uno y qu ediga por consola los años vivido

    }
}
