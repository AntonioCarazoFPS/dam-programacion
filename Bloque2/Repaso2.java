public class Repaso2 {
    public static void main(String[] args) {
        int multiplos = 0;
        for(int i = 1; i <=50; i++){
            if(i%7 == 0){
                System.out.println(i);
                multiplos++;
            }      
        }
         System.out.println(multiplos); 
    }
}
