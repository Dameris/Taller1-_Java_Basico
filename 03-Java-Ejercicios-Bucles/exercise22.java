package _03_ejercicios_bucles;

import static java.lang.System.out;

public class exercise22 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i ++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j ++) {
                if ((i % j) == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                out.println(i);
            }
        }
    }
}