public class Ejercicio13 {
    public static void main(String[] args) {
        String oficio = System.console().readLine("Escribe si eres albanil, administrador, comercial o arquitecto: ");
        int horas = Integer.parseInt(System.console().readLine("Escribe el numero de horas trabajadas esta semana: "));
        int salario;
        int horasExtras; 
        switch (oficio){
            case "albanil":
                if (horas > 0 && horas <= 40){
                salario = horas * 15;
                } else if (horas > 40) {
                salario = 40 * 15;
                horas = horas - 40;
                horasExtras = horas * 20;
                salario = salario + horasExtras;
                System.out.println("Tu salario es: " + salario);
                }
                break;
            case "administrador":
                if (horas > 0 && horas <= 40){
                salario = horas * 12;
                } else if (horas > 40) {
                salario = 40 * 15;
                horas = horas - 40;
                horasExtras = horas * 18;
                salario = salario + horasExtras;
                System.out.println("Tu salario es: " + salario);
                }
                break;
            case "comercial":
                if (horas > 0 && horas <= 40){
                salario = horas * 18;
                } else if (horas > 40) {
                salario = 40 * 15;
                horas = horas - 40;
                horasExtras = horas * 22;
                salario = salario + horasExtras;
                System.out.println("Tu salario es: " + salario);
                }
                break;
            case "arquitecto":
                if (horas > 0 && horas <= 40){
                salario = horas * 25;
                } else if (horas > 40) {
                salario = 40 * 15;
                horas = horas - 40;
                horasExtras = horas * 35;
                salario = salario + horasExtras;
                System.out.println("Tu salario es: " + salario);
                }
                break;
            }

    }
}
