public class Ejercicio6 {
    public static void main(String[] args) {
        int mes = Integer.parseInt(System.console().readLine("Escribe el mes de tu cumpleaños"));
        int dia = Integer.parseInt(System.console().readLine("Escribe tu dia de cumpleaños"));
        if (mes == 1) {
            if (dia >= 1 && dia <= 19){
                System.out.println("Eres capricornio");
            } else if (dia >= 20 && dia <= 31 ){
                System.out.println("Eres acuario");
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 18){
                System.out.println("Eres acuario");
            } else if (dia >= 19 && dia <= 29 ){
                System.out.println("Eres piscis");
            }  
        }else if (mes == 3) {
            if (dia >= 1 && dia <= 20){
                System.out.println("Eres piscis");
            } else if (dia >= 21 && dia <= 31 ){
                System.out.println("Eres aries");
            } 
        }else if (mes == 4) {
            if (dia >= 1 && dia <= 19){
                System.out.println("Eres aries");
            } else if (dia >= 20 && dia <= 30 ){
                System.out.println("Eres tauro");
            } 
        }else if (mes == 5) {
            if (dia >= 1 && dia <= 20){
                System.out.println("Eres tauro");
            } else if (dia >= 21 && dia <= 31 ){
                System.out.println("Eres géminis");
            } 

        }else if (mes == 6) {
            if (dia >= 1 && dia <= 20){
                System.out.println("Eres géminis");
            } else if (dia >= 21 && dia <= 30 ){
                System.out.println("Eres cáncer");
            } 

        } else if (mes == 7) {
            if (dia >= 1 && dia < 22){
                System.out.println("Eres cáncer");
            } else if (dia >= 23 && dia < 31 ){
                System.out.println("Eres leo");
            } 

        }else if (mes == 8) {
            if (dia >= 1 && dia <= 22){
                System.out.println("Eres leo");
            } else if (dia >= 23 && dia <= 31 ){
                System.out.println("Eres virgo");
            } 

        }else if (mes == 9) {
            if (dia >= 1 && dia <= 22){
                System.out.println("Eres virgo");
            } else if (dia >= 23 && dia <= 30 ){
                System.out.println("Eres libra");
            } 

        }else if (mes == 10) {
            if (dia >= 1 && dia <= 22){
                System.out.println("Eres libra");
            } else if (dia >= 23 && dia <= 31 ){
                System.out.println("Eres escorpio");
            } 

        }else if (mes == 11) {
            if (dia >= 1 && dia <= 21){
                System.out.println("Eres escorpio");
            } else if (dia >= 22 && dia <= 31 ){
                System.out.println("Eres sagitario");
            } 

        }else if (mes == 12) {
            if (dia >= 1 && dia <= 21){
                System.out.println("Eres sagitario");
            } else if (dia >= 22 && dia <= 31 ){
                System.out.println("Eres capricornio");
            } 

        }

    }
}
