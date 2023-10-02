package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la cantidad en megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        scanner.close();

        double kilobytes = megabytes * 1024;
        out.println(megabytes + " MB equivale a " + kilobytes + " KB");
    }
}