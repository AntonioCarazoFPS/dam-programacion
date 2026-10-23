public class Repaso8 {
    public static void main(String[] args) {
        /*
        Ticket de la compra. Se compran 5 productos. Para cada uno se pide el precio sin IVA y 
        la categoría: 1 alimentación básica (4 %), 2 alimentación (10 %) o 3 general (21 %). 
        El IVA se aplica con un switch y, al final, se muestran el total sin IVA, el IVA y el total a pagar.
        */
       double producto1 = 0;
       int categoría = 0;
       double totalSinIva = 0;
       double IVA = 0;
       double total = 0;
       for(int i = 1; i <= 5; i++){
           producto1 = Double.parseDouble(System.console().readLine("Escribe el precio sin IVA: "));
           categoría = Integer.parseInt(System.console().readLine("Escribe el numero de categoria"));
           totalSinIva = totalSinIva + producto1;
           switch(categoría){
            case 1:
                IVA = producto1 * 0.04;
                total = total+ (producto1 + IVA);
                break;
            case 2:
                IVA = producto1 * 0.04;
                total = total+ (producto1 + IVA);
                break;
            case 3:
                IVA = producto1 * 0.04;
                total = total+ (producto1 + IVA);
                break;
           }
       }
       System.out.println("El total a pagar sin IVA es " + producto1 + " lo que hay que pagar de IVA es " + IVA + " en total ha");
    }
}
