package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la base imponible (precio sin IVA): ");
        double baseImponible = scanner.nextDouble();

        scanner.close();

        double porcentajeIVA = 0.21;
        double totalFactura = baseImponible * (1 + porcentajeIVA);

        out.println("Base Imponible: " + baseImponible);
        out.println("Porcentaje de IVA: " + (porcentajeIVA * 100) + "%");
        out.println("Total de la Factura: " + totalFactura);
    }
}