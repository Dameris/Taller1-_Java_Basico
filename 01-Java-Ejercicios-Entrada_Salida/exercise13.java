package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la nota media deseada: ");
        double mediaDeseada = scanner.nextDouble();

        out.println("Ingrese la nota obtenida en el primer examen: ");
        double primerExamen = scanner.nextDouble();

        scanner.close();

        double segundoExamen = (mediaDeseada - (0.4 * primerExamen)) / 0.6;
        out.println("Para alcanzar una nota media de " + mediaDeseada + " necesitas obtener " + segundoExamen + " en el segundo examen.");
    }
}