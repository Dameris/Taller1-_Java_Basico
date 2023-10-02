package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la cantidad en kilobytes (KB): ");
        double kilobytes = scanner.nextDouble();

        scanner.close();

        double megabytes = kilobytes / 1024;
        out.println(kilobytes + " KB equivale a " + megabytes + " MB");
    }
}