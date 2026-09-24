public class EsquemaB1 {
    public static void main(String[] args) {
        //Variables y sus tipos
        /*
            int: numeros enteros
            long: numeros enteros más largos
            float: numeros decimales pequeños(Se añade f al final.)
            double: numeros decimales largos
            char: un solo caracter
            String: varios caracteres (palabras o frase)
            boolean: true o false
         */
        //Cambios de variables de un tipo a otro
            /*Entre numeros:
                Si no se pierde info: no hay que hacer nada
                Si se pierde info: parentesis y el tipo (int num = (double) 3.4)
            Si convertimos en un String a numero:
                Integer.parseInt()
                Double.parseDouble()
        */
        //Operaciones matematicas
        /*
            Suma: + 
            Resta: -
            Multiplicacion: * 
            Division: /
            Resto de division: %
            Aumentar en 1: ++
            Disminuir en 1: --
            Incremento +=
            Decremento -=
            11
         */
        int x = 10;
        x++;
        x--;
        x++;
        System.out.println(x);
        double num = 7.5;
        int entero = (int) num;
        double decimal = num - entero;
        System.out.println(entero);
        System.out.println(decimal);
        int numero = 5;
        System.out.println(numero/2);
        System.out.println(numero%2);
        String a = "5";
        String b = "3";
        System.out.println(a+b);
    }
}
