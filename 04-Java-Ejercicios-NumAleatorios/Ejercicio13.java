package Ejercicios_practicar_Java_4;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[]args){
        Random random = new Random();
        int d1=0;
        int d2=1;
        int numt=0;
        while (d1!=d2){
            d1= random.nextInt(1,7);
            d2 = random.nextInt(1,7);
            numt++;
        }
        System.out.println("Ya ha salido lo mismo ("+d1+","+d2+"), solo han hecho falta "+numt+" tiradas.");
    }
}
