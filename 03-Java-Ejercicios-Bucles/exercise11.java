package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        out.println("Número   Cuadrado   Cubo");

        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            out.printf("%-8d %-10d %-4d%n", i, cuadrado, cubo);
        }
    }
}