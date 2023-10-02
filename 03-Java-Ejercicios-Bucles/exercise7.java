package _03_ejercicios_bucles;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contrasenya = 5460;
        int oportunidades = 4;

        while (oportunidades > 0) {
            out.println("Introduce la combinación de la caja fuerte:");
            int contrasenyaUser = scanner.nextInt();

            if (contrasenya != contrasenyaUser) {
                out.println("Lo siento, esa no es la combinación");
                oportunidades --;
            }
            else {
                out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
    }
}