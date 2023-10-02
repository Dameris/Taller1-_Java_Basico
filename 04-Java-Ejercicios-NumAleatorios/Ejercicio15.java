package Ejercicios_practicar_Java_4;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[]args){
        String[] notas = {"do","re","mi","fa","sol","la","si"};
        Random random = new Random();
        int multi = random.nextInt(1,8);
        String mel="";
        for (int i=0;i<multi;i++){
            for (int j=0;j<4;j++){
                mel+=" "+notas[random.nextInt(random.nextInt(1,8))]+" ";
            }
            mel+="|";
        }
        mel+="|";
        System.out.println(mel);
    }
}
