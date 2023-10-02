package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesetas = 166.386;

        out.println("Introduce la cantidad de € a convertir a pesetas: ");
        int euros = scanner.nextInt();

        out.println(euros + "€ son " + (euros * pesetas) + " pesetas");
    }
}