package _04_ejercicios_num_aleatorios;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(20, 0, 11);
        Iterator<Integer> iterator = intStream.iterator();

        while (iterator.hasNext()) {
            out.print(iterator.next() + " ");
        }
    }
}