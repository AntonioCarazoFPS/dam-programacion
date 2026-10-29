public class Ejercicio3 {
    /*
    El programa principal (main) pide un número al usuario y 
    muestra un menú con opciones:

Método que imprime si un número pasado como parámetro es par o impar 
(imprime la palabra “par” o la palabra “impar”).
Método que imprime directamente la tabla de multiplicar del 
número que le pasamos como parámetro.
Método que imprime un número que sea la mitad del número que 
le pasamos como parámetro.
Método que imprime un número aleatorio entre el 0 y el número que 
le pasamos como parámetro.
Método que comprueba si es primo e imprime si lo es o no. 
Dependiendo de la elección del usuario, se invoca a un método 
u otro para que realice la acción, pasándole como parámetro el número. 
Puedes reutilizar código de ejercicios anteriores.
    */
   public static void main(String[] args) {
    System.out.println("Elige una opción:");
    System.out.println("1. Comprobar si un número es par o impar");
    System.out.println("2. Mostrar la tabla de multiplicar de un número");
    System.out.println("3. Mostrar la mitad de un número");
    System.out.println("4. Generar un número aleatorio entre 0 y el número introducido");
    System.out.println("5. Comprobar si un número es primo");
    int num1 = Integer.parseInt(IO.readln("Escribe tu numero: "));
    switch (num1) {
        case 1:
            uno();  
            break;
        case 2:
            dos();  
            break;
        case 3:
            tres();  
            break;
        case 4:
            cuatro();  
            break;
        case 5:
            cinco();
            break;
    }
   }
   static void uno(){
    int parImpar = Integer.parseInt(IO.readln("Escribe el numero que quieres hacer par o impar: "));
    if (parImpar % 2 == 0) {
        System.out.println("Es par");
    } else{
        System.out.println("Es impar");
    }
}
static void dos(){
       int tablaMultiplicar = Integer.parseInt(IO.readln("Escribe el numero que quieres multiplicar: "));
       int i;
       for (i = 0; i <= 10; i++){
        int numMultiplicacion = tablaMultiplicar * i;
        System.out.println(tablaMultiplicar + " x " + i + " = " + numMultiplicacion);
       }
   }
   static void tres(){
    int numMitad = Integer.parseInt(IO.readln("Escribe el numero que quieres saber su mitad: "));
    int mitad = numMitad % 2;
    System.out.println(numMitad + " la mitad es " + mitad);
   }
   static void cuatro(){
    
   }
   static void cinco(){

   }
}
