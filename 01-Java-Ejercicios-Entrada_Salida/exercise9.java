package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese el radio (r) del cono: ");
        double radio = scanner.nextDouble();

        out.println("Ingrese la altura (h) del cono: ");
        double altura = scanner.nextDouble();

        scanner.close();

        // Fórmula V = (1/3) * π * r^2 * h
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

        out.println("El volumen del cono es: " + volumen);
    }
}