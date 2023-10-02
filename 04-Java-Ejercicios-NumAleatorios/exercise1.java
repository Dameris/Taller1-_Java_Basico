package _04_ejercicios_num_aleatorios;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class exercise1 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(3, 1, 7);
        Iterator<Integer> iterator = intStream.iterator();

        int contadorTiradas = 0;

        while (iterator.hasNext()) {
            contadorTiradas ++;
            out.println("Tirada número " + contadorTiradas + ": " + iterator.next());
        }
    }
}