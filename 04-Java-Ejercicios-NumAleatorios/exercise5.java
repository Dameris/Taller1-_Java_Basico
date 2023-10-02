package _04_ejercicios_num_aleatorios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class exercise5 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(50, 100, 200);
        Iterator<Integer> iterator = intStream.iterator();

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        while (iterator.hasNext()) {
            int numeroAleatorio = iterator.next();
            listaNumeros.add(numeroAleatorio);
            out.print(numeroAleatorio + " ");
        }

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int contadorNumeros = 0;
        int suma = 0;
        int media;

        for (Integer listaNumero : listaNumeros) {
            if (listaNumero > maxNum) {
                maxNum = listaNumero;
            }

            if (listaNumero < minNum) {
                minNum = listaNumero;
            }

            contadorNumeros ++;
            suma += listaNumero;
        }

        media = suma / contadorNumeros;

        out.println();
        out.println("Máximo: " + maxNum);
        out.println("Mínimo: " + minNum);
        out.println("Media: " + media);
    }
}