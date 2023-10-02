package Ejercicios_practicar_Java_4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]ars){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el número pensado : ");
        int num = scanner.nextInt();
        int numb= random.nextInt(101);
        int nint=0;
        while (nint<5){
            if (numb==num){
                System.out.println("Acerté tu número! ("+numb+")");
            }
            System.out.println("El número es mayor o menor que este número :"+numb);
            String resp = scanner.next();
            if (resp.equals("mayor")){
                numb++;
            }
            if (resp.equals("menor")){
                numb--;
            }
            nint++;
        }
        if (num!=numb){
            System.out.println("Fallé en todas las oportunidades");
        }
    }
}
