package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        String n1=scanner.next();
        if (n1.charAt(0)=='-'){
            if (n1.length()<=6){
                System.out.print("Este número tiene  "+(n1.length()-1)+" dígito/s");
            } else {
                System.out.print("Lo siento tu número es demasiado grande");
            }
        }else {
            if (n1.length()<=5){
                System.out.print("Este número tiene  "+n1.length()+" dígito/s");
            } else {
                System.out.print("Lo siento tu número es demasiado grande");
            }
        }

    }
}
