package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu mes de nacimiento : ");
        int n1=scanner.nextInt();
        System.out.println("Introduce tu mes de nacimiento : ");
        int n2=scanner.nextInt();
        switch (n1) {
            case 1:
                if (n2 <= 19) {
                    System.out.print("Tu signo del zodiaco es Capricornio ♑ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Acuario ♒ .");
                }
                break;

            case 2:
                if (n2 <= 18) {
                    System.out.print("Tu signo del zodiaco es Acuario ♒ .");
                } else {
                    System.out.print("Tu signo del zodiaco esPiscis ♓ .");
                }
                break;

            case 3:
                if (n2 <= 20) {
                    System.out.print("Tu signo del zodiaco es Piscis ♓ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Aries ♈ .");
                }
                break;

            case 4:
                if (n2 <=20) {
                    System.out.print("Tu signo del zodiaco es Aries ♈ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Tauro ♉ .");
                }
                break;

            case 5:
                if (n2 <= 20 ) {
                    System.out.print("Tu signo del zodiaco es Tauro ♉ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Géminis ♊ .");
                }
                break;

            case 6:
                if (n2 <= 20) {
                    System.out.print("Tu signo del zodiaco es Géminis ♊ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Cáncer ♋ .");
                }
                break;

            case 7:
                if (n2 <= 20) {
                    System.out.print("Tu signo del zodiaco es Cáncer ♋ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Leo ♌ .");
                }
                break;

            case 8:
                if (n2 <= 21) {
                    System.out.print("Tu signo del zodiaco es Leo ♌ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Virgo ♍ .");
                }
                break;

            case 9:
                if (n2 <= 22) {
                    System.out.print("Tu signo del zodiaco es Virgo ♍ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Libra ♎ .");
                }
                break;

            case 10:
                if (n2 <= 22) {
                    System.out.print("Tu signo del zodiaco es Libra ♎ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Escorpio ♏ .");
                }
                break;

            case 11:
                if (n2 <= 22) {
                    System.out.print("Tu signo del zodiaco es Escorpio ♏ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Sagitario ♐ .");
                }
                break;

            case 12:
                if (n2 <= 20) {
                    System.out.print("Tu signo del zodiaco es Sagitario ♐ .");
                } else {
                    System.out.print("Tu signo del zodiaco es Capricornio ♑ .");
                }
                break;
        }

    }
}
