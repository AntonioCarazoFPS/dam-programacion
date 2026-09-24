public class Ejercicio10 {
    public static void main(String[] args) {
        double lado1 = Double.parseDouble(System.console().readLine("Indicame el primer lado::  "));
        double lado2 = Double.parseDouble(System.console().readLine("Indicame el segundo lado: "));
        //Pedimos por consola los lados
        double area1 = lado1 * lado2;
        System.out.println("La area es " + area1);
        //Calculamos el area y lo mostramos por consola
        double perimetro1 = (lado1 + lado2) * 2;
        System.out.println("El perimetro es " + perimetro1);
        //Calculamos el area teniendo en cuenta la prioridad del parentesis y lo mostramos por consola
    }
}
