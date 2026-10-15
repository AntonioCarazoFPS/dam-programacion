public class Ejercicio24 {
    public static void main(String[] args) {
        int tabla = Integer.parseInt(System.console().readLine("Escribe la tabla de multiplicar que deseas: "));
        for(int i = 0; i <= 10 ; i++){
            int calculo = i * tabla;
        System.out.println(tabla + " x " + i + " " + calculo);
        }
    }
}
