package _03_ejercicios_bucles;

import static java.lang.System.out;

public class exercise6 {
    public static void main(String[] args) {
        int numero = 320;

        do {
            out.println(numero);
            numero -= 20;
        }
        while (numero > 159);
    }
}