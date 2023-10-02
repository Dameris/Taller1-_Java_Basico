package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        out.println("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = (base * altura) / 2;
        out.println("El área del triángulo es: " + area);
    }
}