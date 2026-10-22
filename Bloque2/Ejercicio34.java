public class Ejercicio34 {
    public static void main(String[] args) {
        double ahorro = Double.parseDouble(System.console().readLine("Escribe la cantidad de dinero que quieres ahorrar: "));
        double dineroHucha = 0;
        do{
            double ingreso = Double.parseDouble(System.console().readLine("Escribe el dinero que vas a echar/sacar"));
            dineroHucha = dineroHucha + ingreso;
        }while (ahorro >= dineroHucha);
            
        
    }
}
