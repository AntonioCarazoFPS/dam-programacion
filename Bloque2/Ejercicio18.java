public class Ejercicio18 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("Escribe tu edad: "));
        if (edad >= 18) {
            String apuesta = System.console().readLine(
                    "Escribe que opcion quieres que demos para tu apuesta: color, numero, columna, pareimpar (Escribelo tal como aparece por consola):");
            switch (apuesta) {
                case "color":
                    int color = (int) (Math.random() * 3);
                    switch (color) {
                        case 0:
                            System.out.println("Negro");
                            break;
                        case 1:
                            System.out.println("Rojo");
                            break;
                        case 2:
                            System.out.println("Verde");
                            break;
                    }
                    break;
                case "numero":
                    int numero = (int) (Math.random() * 37);
                    System.out.println("Tu numero es: " + numero);
                    break;
                case "columna":
                    int columna = (int) (Math.random() * 3) + 1;
                    System.out.println("La columna es: " + columna);
                    break;
                case "pareimpar":
                    int pareimpar = (int) (Math.random() * 2);
                    switch (pareimpar) {
                        case 0:
                            System.out.println("Es par");
                            break;
                        case 1:
                            System.out.println("Es impar");
                            break;
                    }
                    break;
            }
        }
    }
}
