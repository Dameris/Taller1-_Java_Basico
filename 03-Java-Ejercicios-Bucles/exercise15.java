package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la base: ");
        double base = scanner.nextDouble();

        out.println("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        if (exponente >= 1) {
            out.println("Potencias de " + base + " desde 1 hasta " + exponente + ":");
            for (int i = 1; i <= exponente; i ++) {
                double resultado = 1.0;

                for (int j = 1; j <= i; j ++) {
                    resultado *= base;
                }
                out.println(base + " ^ " + i + " = " + resultado);
            }
        }
        else {
            out.println("El exponente debe ser un número entero positivo");
        }
    }
}