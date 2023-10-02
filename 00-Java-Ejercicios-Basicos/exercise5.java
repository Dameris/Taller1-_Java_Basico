package _00_ejercicios_basicos;

import static java.lang.System.out;

public class exercise5 {
    public static void main(String[] args) {
        double euros = 0.0060;
        int pesetas = 10200;

        out.println(pesetas + " pesetas son " + (euros * pesetas) + "€");
    }
}