package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese un número: ");
        long numero = scanner.nextLong();

        scanner.close();

        if (numero < 0) {
            numero = -numero;
        }

        int contadorDigitos = 0;

        while (numero > 0) {
            numero = numero / 10;
            contadorDigitos ++;
        }

        out.println("El número ingresado tiene " + contadorDigitos + " dígitos.");
    }
}