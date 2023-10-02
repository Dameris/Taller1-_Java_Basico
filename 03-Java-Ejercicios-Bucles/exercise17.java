package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInicial;

        do {
            out.println("Ingrese un número entero y positivo: ");
            numeroInicial = scanner.nextInt();
        }
        while (numeroInicial <= 0);

        scanner.close();

        int suma = 0;

        for (int i = 1; i <= 100; i ++) {
            suma += numeroInicial + i;
        }

        out.println("La suma de los 100 números siguientes a " + numeroInicial + " es: " + suma);
    }
}