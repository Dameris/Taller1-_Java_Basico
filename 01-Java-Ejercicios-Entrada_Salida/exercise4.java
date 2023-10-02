package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        out.println("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        out.println("Suma = " + suma +
                "\nResta = " + resta +
                "\nMultiplicación = " + multiplicacion +
                "\nDivisión = " + division);
    }
}