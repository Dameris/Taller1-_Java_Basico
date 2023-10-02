package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero, segundoNumero;

        do {
            out.println("Ingrese el primer número: ");
            primerNumero = scanner.nextInt();

            out.println("Ingrese el segundo número (distinto al primero): ");
            segundoNumero = scanner.nextInt();

            if (primerNumero == segundoNumero) {
                out.println("Los números deben ser distintos. Inténtelo de nuevo.");
            }
        } while (primerNumero == segundoNumero);

        int numeroMenor = Math.min(primerNumero, segundoNumero);
        int numeroMayor = Math.max(primerNumero, segundoNumero);

        for (int i = numeroMenor; i <= numeroMayor; i += 7) {
            out.println(i);
        }
    }
}