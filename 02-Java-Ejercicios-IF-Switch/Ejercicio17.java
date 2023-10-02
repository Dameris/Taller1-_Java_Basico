package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        String n1=scanner.next();
        int ult = n1.length()-1;
        System.out.print("La última cifra de este número es "+n1.charAt(ult));
    }
}
