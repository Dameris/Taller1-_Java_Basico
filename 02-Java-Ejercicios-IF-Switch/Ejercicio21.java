package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota del segundo control: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = scanner.next();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        }
        System.out.print("Tu nota de Programación es " + media);
    }
}
