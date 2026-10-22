public class Repaso5 {
    public static void main(String[] args) {
        /*
        Temperaturas de la semana. Un for del 1 al 7 pide la temperatura de cada día y 
        muestra el nombre del día con un switch (lunes, martes…). Además dice si ese día hizo 
        frío (menos de 15), una temperatura agradable (de 15 a 30) o calor (más de 30). */
        for(int i = 1; i <= 7; i++){
            int temperatura = 0;
            switch (i) {
                case 1:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Lunes: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 2:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Martes: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 3:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Miercoles: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 4:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Jueves: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 5:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Viernes: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 6:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Sabado: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
                case 7:
                temperatura = Integer.parseInt(System.console().readLine("Dime la temperatura que hizo el Domingo: "));
                if (temperatura < 15) {
                    System.out.println("Ese dia hizo frio");
                } else if(temperatura >= 15 && temperatura <= 30){
                    System.out.println("La temperatura es agradable");
                } else if (temperatura > 30){
                    System.out.println("Ese dia hizo calor");
                }
                break;
            
            }
        }
    }
}
