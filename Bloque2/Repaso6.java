public class Repaso6 {
    public static void main(String[] args) {
        /*
        Estadística de un dado. Lanza un dado 30 veces con Math.random() 
        y cuenta con un switch cuántas veces ha salido cada cara. Al final muestra los seis contadores.
        */
       int cara1 = 0;
       int cara2 = 0;
       int cara3 = 0;
       int cara4 = 0;
       int cara5 = 0;
       int cara6 = 0;
       for(int i = 0; i<=30; i++){
        int dado = (int) (Math.random()*6) + 1;
        System.out.println(dado);
        switch (dado) {
            case 1:
            cara1++;    
            break;
            case 2:
            cara2++;
            break;
            case 3:
            cara3++;
            break;
            case 4:
            cara4++;    
            break;
            case 5:
            cara5++;     
            break;
            case 6:
            cara6++;     
            break;
        }
        System.out.println("La cara 1 ha salido " + cara1 + " veces , la cara 2 ha salido " + cara2 + " veces , la cara 3 ha salido " + cara3 + " veces , la cara 4 ha salido " + cara4 + " veces , la cara 5 ha salido " + cara5 + " veces , la cara 6 ha salido " + cara6);
        
        }
       }
    }
