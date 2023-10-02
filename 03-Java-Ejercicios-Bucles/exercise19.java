package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        out.println("Ingrese el carácter para dibujar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i ++) {
            for (int j = 1; j <= altura - i; j ++) {
                out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k ++) {
                out.print(caracter);
            }

            out.println();
        }
    }
}