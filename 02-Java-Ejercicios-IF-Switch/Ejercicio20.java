package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        String n1=scanner.next();
        if (n1.length()==5){
            if (n1.charAt(0)==n1.charAt(4)){
                if (n1.charAt(1)==n1.charAt(3)){
                    System.out.print(n1+" es capicúa!");
                } else {
                    System.out.print(n1+" no es capicúa");
                }
            }else {
                System.out.print(n1+" no es capicúa");
            }
        }
        if (n1.length()==4){
            if (n1.charAt(0)==n1.charAt(3)){
                if (n1.charAt(1)==n1.charAt(2)){
                    System.out.print(n1+" es capicúa!");
                } else {
                    System.out.print(n1+" no es capicúa");
                }
            }else {
                System.out.print(n1+" no es capicúa");
            }
        }
        if (n1.length()==3){
            if (n1.charAt(0)==n1.charAt(2)){
                System.out.print(n1+" es capicúa!");
            }else {
                System.out.print(n1+" no es capicúa");
            }
        }
        if (n1.length()==2){
            if (n1.charAt(0)==n1.charAt(1)){
                System.out.print(n1+" es capicúa!");
            }else {
                System.out.print(n1+" no es capicúa");
            }
        }
        if (n1.length()==1){
            System.out.print(n1+" solo tiene 1 dígito");
        }
    }
}
