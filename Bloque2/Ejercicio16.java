public class Ejercicio16 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*3);
        switch(num1){
            case 0:
                System.out.println("Tijera");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Piedra");
                break;
        }
    }
}
