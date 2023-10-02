package Ejercicios_practicar_Java_4;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[]args){
        Random random=new Random();
        int susp=0;
        int suf=0;
        int bien=0;
        int notable=0;
        int sobre=0;
        for (int i=0;i<20;i++){
            int num = random.nextInt(5);
            switch (num){
                case 0:
                    susp++;
                    System.out.println("Suspenso");
                    break;
                case 1:
                    suf++;
                    System.out.println("Suficiente");
                    break;
                case 2:
                    bien++;
                    System.out.println("Bien");
                    break;
                case 3:
                    notable++;
                    System.out.println("Notable");
                    break;
                case 4:
                    sobre++;
                    System.out.println("Sobresaliente");
                    break;


            }
        }
        System.out.println("Número de suspensos : "+susp);
        System.out.println("Número de suficientes : "+suf);
        System.out.println("Número de bienes: "+bien);
        System.out.println("Número de notables : "+notable);
        System.out.println("Número de sobresalientes : "+sobre);


    }
}
