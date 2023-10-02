package _01_ejercicios_entrada_salida;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euros = 0.0060;

        out.println("Introduce la cantidad de pesetas a convertir a €: ");
        int pesetas = scanner.nextInt();

        out.println(pesetas + " pesetas son " + (euros * pesetas) + "€");
    }
}