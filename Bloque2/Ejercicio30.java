public class Ejercicio30 {
public static void main(String[] args) {
    //for se usa cuando sabemos el numero de repticiones
    //while cuando no sabemos num de repeticiones (Esperamos a que alguna condificion se cumpla)
    String usuario = "";
    //forma1
    while (!usuario.equals("si")) {
        //mientras que el usuario algo distinto a "si"
        usuario = System.console().readLine("Quieres apagar? (si/no)");
    }
    System.out.println("Fin");
    //forma2
    while (true) {
        usuario = System.console().readLine("Quieres apagar? (Si/No)");
        if (usuario.equals("Si")) {
            break;
        }
    }
    //forma3
    do{
        usuario = System.console().readLine("Quieres apagar? (Sii/Noo)");
    }while (!usuario.equals("Sii"));
}
    
}