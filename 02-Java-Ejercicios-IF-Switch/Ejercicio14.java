package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        int n1 = scanner.nextInt();
        if (n1%2==0){
            System.out.print("Es un par!\n");
        }
        if (n1%5==0){
            System.out.print("Es divisible entre 5!");
        }
    }
}
