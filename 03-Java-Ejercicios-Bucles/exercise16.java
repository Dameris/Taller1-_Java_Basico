package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        scanner.close();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        }
        else {
            for (int i = 2; i < numero; i ++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            out.println(numero + " es un número primo");
        }
        else {
            out.println(numero + " no es un número primo");
        }
    }
}
