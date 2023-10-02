package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Ingrese la cantidad de términos de la serie de Fibonacci que desea mostrar: ");
        int numerosMostrar = scanner.nextInt();

        scanner.close();

        int primero = 0;
        int segundo = 1;

        out.println("Serie de Fibonacci con " + numerosMostrar + " términos: ");

        for (int i = 0; i < numerosMostrar; i++) {
            out.println(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}