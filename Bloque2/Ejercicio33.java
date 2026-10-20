public class Ejercicio33 {
    public static void main(String[] args) {
        double saldo = 100;
        double movimiento;
        while (saldo >= 0) {
            movimiento = Double.parseDouble(System.console().readLine("Cuanto dinero quieres ingresar/sacar? "));
            saldo = saldo + movimiento;
            System.out.println("Tienes " + saldo + " euros");
        }
        System.out.println("Tas quedado sin un duro");
    }
}
