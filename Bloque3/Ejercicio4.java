public class Ejercicio4 {
     public static void main(String[] args) {
    /*
    Desarrolla un programa que muestre un menú al usuario con las siguientes opciones:
    Preguntar una cantidad de horas y minutos, y mostrar el equivalente en segundos.
    Preguntar una cantidad de días, y mostrar el equivalente en horas. En función de la opción elegida, 
    pedirá el dato (horas y minutos, o días) y se lo pasará por parámetro a un método para que haga los cálculos 
    y muestre los resultados.
    */  
   System.out.println("1  Preguntar una cantidad de horas y minutos, y mostrar el equivalente en segundos.");
   System.out.println("2  Preguntar una cantidad de días, y mostrar el equivalente en horas.");
   int menu1 = Integer.parseInt(IO.readln("Escribe el numero para elegir el menu: "));
   switch(menu1){
    case 1:
        int hora = Integer.parseInt(IO.readln("Escribe la cantidad de horas que quieres convertir: "));
        int minutos = Integer.parseInt(IO.readln("Escribe la cantidad de minutos que quieres convertir: "));
        convSegundos(hora, minutos);
        break;
    case 2:
        int dias = Integer.parseInt(IO.readln("Escribe la cantidad de dias que quieres convertir: "));
        convHoras(dias);
        break;
   }
    }
    static void convSegundos(int n1, int n2){
    int horasMinutos = n1 * 60;
    int minutos = horasMinutos + n2;
    int minutosSegundos = minutos * 60;
    System.out.println("La conversion en segundo es: " + minutosSegundos + " s");
    }
    static  void convHoras(int n1){
    int diasHoras = n1 * 24;
    System.out.println("La conversion en horas es: " + diasHoras + " h");
    }
}
