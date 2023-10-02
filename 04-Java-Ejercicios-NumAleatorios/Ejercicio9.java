package Ejercicios_practicar_Java_4;


import java.util.Random;

public class Ejercicio9 {
    public static void main(String[]args){
        Random random = new Random();
        int cont = 0;
        int n = 0;
        while (n!=24){
            n =random.nextInt(101);
            if(n%2==0){
                cont++;
            }
        }

        System.out.println("Han salido "+cont+" números antes de que saliera el "+n);
    }
}
