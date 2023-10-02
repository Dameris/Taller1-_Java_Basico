package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        out.println("Ingrese el carácter para dibujar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i ++) {
            if (i == 1 || i == altura) {
                for (int j = 1; j <= i; j ++) {
                    out.print(caracter);
                }
            }
            else {
                out.print(caracter);

                for (int k = 2; k < i; k ++) {
                    out.print(" ");
                }

                out.print(caracter);
            }

            out.println();
        }
    }
}