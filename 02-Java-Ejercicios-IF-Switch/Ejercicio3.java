package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Di un número del 1 al 7 : ");
        int num = scanner.nextInt();
        switch (num){
            case 1 :
                System.out.println("Lunes");
                break;
            case 2 :
                System.out.println("Martes");
                break;
            case 3 :
                System.out.println("Miércoles");
                break;
            case 4 :
                System.out.println("Jueves");
                break;
            case 5 :
                System.out.println("Viernes");
                break;
            case 6 :
                System.out.println("Sábado");
                break;
            case 7 :
                System.out.println("Domingo");
                break;
        }
    }
}
