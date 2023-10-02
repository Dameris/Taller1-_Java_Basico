package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayorPar = 0;
        int mediaImpares = 0;
        int contadorImpares = 0;
        int numeroTeclado;
        int contador = 0;

        do {
            out.println("Escribe un número: ");
            numeroTeclado = scanner.nextInt();

            if (numeroTeclado >= 0) {
                contador += 1;

                if ((numeroTeclado % 2) == 0) {
                    if (mayorPar < numeroTeclado) {
                        mayorPar = numeroTeclado;
                    }
                }
                else {
                    mediaImpares += numeroTeclado;
                    contadorImpares += 1;
                }
            }
        } while (numeroTeclado >= 0);

        out.println("Se han introducido " + contador + " números");

        if (contadorImpares == 0) {
            out.println("La media de los números impares introducidos es: 0");
        }
        else {
            out.println("La media de los números impares introducidos es: " + (mediaImpares / contadorImpares));
        }

        out.println("El mayor de los números pares introducidos es: " + mayorPar);
    }
}