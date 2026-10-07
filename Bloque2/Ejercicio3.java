public class Ejercicio3 {
public static void main(String[] args) {
    System.out.println("Bienvenido al programa de dorsales del equip");
    int numeroDorsal = Integer.parseInt(System.console().readLine("Escribe el numero de dorsal: "));
    if (numeroDorsal==1){
        System.out.println("Tu jugador es Pepe");
    } else if (numeroDorsal==2){
        System.out.println("Tu jugador es Juanjo");
    } else if (numeroDorsal==3){
        System.out.println("Tu jugador es Luis");
    } else if (numeroDorsal==4){
        System.out.println("Tu jugador es Jose");
    } else if (numeroDorsal==5){
        System.out.println("Tu jugador es Dani");
    }
}
    
}