package Ejercicios_practicar_Java_4;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[]args){
        Random random=new Random();
        String[] car = new String[6];
        car[0]="*";
        car[1]="-";
        car[2]="=";
        car[3]=".";
        car[4]="|";
        car[5]="@";
        String lin =car[random.nextInt(6)];
        for (int i =0;i<10;i++){
            String linea ="";
            for (int j=0;j< random.nextInt(1,41);j++){
                linea+=lin;
            }
            System.out.println(linea);
        }
    }
}
