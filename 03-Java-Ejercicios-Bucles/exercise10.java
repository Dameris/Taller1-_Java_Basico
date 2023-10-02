package _03_ejercicios_bucles;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Vamos a hacer la media de varios números\n" +
                    "Si desea dejar de introducir números, introduzca un número negativo");

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        while (true) {
            out.println("Introduce un número");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                listaNumeros.add(numero);
            }
            else {
                break;
            }
        }

        int sumaNumeros = 0;
        int i;

        for (i = 0; i < listaNumeros.size(); i ++) {
            sumaNumeros += listaNumeros.get(i);
        }

        double media = (double) sumaNumeros / i;
        out.println("La media de los números " + listaNumeros + " es " + media);
    }
}