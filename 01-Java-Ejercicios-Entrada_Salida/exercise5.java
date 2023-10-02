package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        out.println("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        scanner.close();

        double area = longitud * ancho;
        out.println("El área del rectángulo es: " + area);
    }
}