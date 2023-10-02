package _03_ejercicios_bucles;

import static java.lang.System.out;

public class exercise3 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            out.println(numero * 5);
            numero ++;
        }
        while (numero < 101);
    }
}