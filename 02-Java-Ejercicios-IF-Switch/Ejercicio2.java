package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la hora : ");
        int hora = scanner.nextInt();
        if ((hora>=6) && (hora<=12)) {
            System.out.println("Buenos días!");
        }
        if ((hora>=13) && (hora<=20)) {
            System.out.println("Buenos tardes!");
        }
        if ((hora>=21) || (hora<=5)) {
            System.out.println("Buenos noches!");
        }
    }
}
