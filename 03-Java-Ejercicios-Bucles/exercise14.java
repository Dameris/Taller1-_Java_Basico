package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la base: ");
        double base = scanner.nextDouble();

        out.println("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        double resultado = 1;

        if (exponente >= 0) {
            for (int i = 0; i < exponente; i ++) {
                resultado *= base;
            }

            out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
        }
        else {
            out.println("El exponente debe ser un número entero positivo");
        }
    }
}