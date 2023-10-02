package _03_ejercicios_bucles;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i <= 10; i ++) {
            out.println("Introducir número: ");
            listaNumeros.add(scanner.nextInt());
        }

        int contador = 0;

        for (int i = 0; i < listaNumeros.size(); i ++) {
            if (listaNumeros.get(contador) > 0) {
                out.println(listaNumeros.get(contador) + " es positivo");
            }
            else if (listaNumeros.get(contador) < 0) {
                out.println(listaNumeros.get(contador) + " es negativo");
            }
            else {
                out.println(listaNumeros.get(contador));
            }
            contador ++;
        }
    }
}