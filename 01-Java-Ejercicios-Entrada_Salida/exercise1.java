package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        out.println("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int resultado = numero1 * numero2;
        out.println("El resultado de la multiplicación es: " + resultado);
    }
}