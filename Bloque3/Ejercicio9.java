public class Ejercicio9 {
    /*
    Desarrolla un programa que de al menos 3 opciones al usuario diferentes para generar números aleatorios 
    (las que tú quieras). Por ejemplo:

Generar número aleatorio decimal entre 0 y 1.
Generar número aleatorio entero entre 1 y 10.
Etc. En función de la opción elegida, se pedirá a una función que genere el aleatorio y lo devuelva al main para que éste 
lo muestre por consola. Ampliación: podrías hacer este ejercicio con una sola función?
    */
    public static void main(String[] args) {
        System.out.println("Generar número aleatorio decimal entre 0 y 1.");
        System.out.println("Generar número aleatorio entero entre 1 y 10.");
        System.out.println("Generar número aleatorio entero entre 1 y 100.");
    int menu1 = Integer.parseInt(IO.readln("Que opcion eliges: "));
    System.out.println(menu(menu1));
} 
static double menu(int n1){
    
    double numero;
    switch(menu1){
        case 1:
            double numeroDecimal = Math.random();
            return 
            break;
            case 2:
                int numeroAleatorio1 = (int) (Math.random()*9) + 1;
                return numeroAleatorio1;
                break;
            case 3:
                int numeroAleatorio = (int)(Math.random()*100) + 1;
                break;
        }

    } 
    }

