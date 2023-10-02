package _03_ejercicios_bucles;

import static java.lang.System.out;

public class exercise5 {
    public static void main(String[] args) {
        int numero = 320;

        while (numero > 159) {
            out.println(numero);
            numero -= 20;
        }
    }
}