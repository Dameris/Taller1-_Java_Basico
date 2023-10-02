package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        String n1=scanner.next();
        if (n1.length()<=5){
            System.out.print("La primera cifra de este número es "+n1.charAt(0));
        } else {
            System.out.print("Lo siento tu número es demasiado grande");
        }
    }
}
