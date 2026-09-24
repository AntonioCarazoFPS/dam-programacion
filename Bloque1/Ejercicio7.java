public class Ejercicio7 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(System.console().readLine("Que nota sacastes en Programacion: "));
        double nota2 = Double.parseDouble(System.console().readLine("Que nota sacastes en BBDD: "));
        double nota3 = Double.parseDouble(System.console().readLine("Que nota sacastes en IP: "));
        double nota4 = Double.parseDouble(System.console().readLine("Que nota sacastes en Digitalizacion: "));
        /*Pedimos las notas por consola. Atento el comando System.console().readLine() funciona solo con string
        Para usar int o double necesitamos añadir Integer.paserInt() o Double.parseDouble()
        Asi se veria la linea completa Double.parseDouble(System.console().readLine("Que nota sacastes en Programacion: "))*/
        double SumaNota = nota1 + nota2 + nota3 + nota4;
        //Sumamos la notas
        double media = SumaNota / 4;
        //Hacemos la media de las notas
        System.out.println("Tus notas del primer trimestre");
        System.out.println("-----------------------------");
        System.out.println("Programacion: " + nota1);
        System.out.println("BBDD: " + nota2);
        System.out.println("IP: " + nota3);
        System.out.println("Digitalizacion: " + nota4);
        System.out.println("Nota media " + media);
        //Creamos el boletin
    }
}
