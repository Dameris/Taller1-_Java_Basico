package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        scanner.close();

        out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            out.println(numero + " x " + i + " = " + resultado);
        }
    }
}