package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la base imponible (precio sin IVA): ");
        double baseImponible = scanner.nextDouble();

        out.println("Seleccione el tipo de IVA:\n" +
                    "1. General (21%)\n" +
                    "2. Reducido (10%)\n" +
                    "3. Superreducido (4%)");
        int tipoIVA = scanner.nextInt();

        double porcentajeIVA = 0;
        switch (tipoIVA) {
            case 1:
                porcentajeIVA = 0.21;
                break;
            case 2:
                porcentajeIVA = 0.10;
                break;
            case 3:
                porcentajeIVA = 0.04;
                break;
            default:
                out.println("Tipo de IVA no válido. Se aplicará el tipo general (21%).");
                porcentajeIVA = 0.21;
                break;
        }

        out.println("Ingrese el código promocional:\n" +
                    "nopro (Sin promoción)\n" +
                    "mitad (Precio reducido a la mitad)\n" +
                    "meno5 (Descuento de 5 euros)\n" +
                    "5porc (Descuento del 5%)");
        String codigoPromocional = scanner.next();

        double descuento = 0;
        switch (codigoPromocional) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = baseImponible / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = baseImponible * 0.05;
                break;
            default:
                out.println("Código promocional no válido. No se aplicará ningún descuento.");
                break;
        }

        double precioSinDescuento = baseImponible * (1 + porcentajeIVA);
        double precioFinal = precioSinDescuento - descuento;

        out.println("Precio sin descuento (con IVA): " + precioSinDescuento + "€");
        out.println("Descuento aplicado: " + descuento + "€");
        out.println("Precio final: " + precioFinal + "€");

        scanner.close();
    }
}