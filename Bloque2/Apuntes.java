public class Apuntes {
    public static void main(String[] args) {
        int num = 1;
        switch(num){
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                case 3:
                    System.out.println("El numero es 3");
                    break;
                    default:
                System.out.println("Numero incorrecto");

                }
        double num2 = Math.random();
        //math.random() genera aleatorios entre 0 - 0.99999
        double num3 = Math.random() * 100;
        //aqui seria de 0 a 99
        int num4 = (int) (Math.random() * 1000);
        //aqui seria de 0 a 999
        int num5 = (int)(Math.random()*10);
        //0-9
        int num6 = (int)(Math.random()*81) + 20;
        //20-100
        int num7 = (int)(Math.random()*8)+12;
        //12-19
        
        //BUCLE FOR (yo determino cuántas repeticiones)
        for(3){
            System.out.println("Hola");
        }
        //for (crear variables; mientras; incremento) Abajo ejemplo:
        for(int i = 0; i<5 ; i++ ){
            System.out.println("Hola");
        }
        //fuera de aqui si hemos creado la variable en el for no se queda guardada
        
    }
}
