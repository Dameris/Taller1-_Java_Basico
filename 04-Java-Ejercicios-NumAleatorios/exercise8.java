package _04_ejercicios_num_aleatorios;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class exercise8 {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream intStream = random.ints(14, 1, 7);
        Iterator <Integer> iterator = intStream.iterator();

        out.println("Quiniela:");

        for (int i = 1; i <= 14; i++) {
            out.print("Partido " + i + ": ");

            String resultadoTexto = "";
            int resultado = iterator.next();

            switch (resultado) {
                case 1:
                case 2:
                case 3:
                    resultadoTexto = "1";
                    break;

                case 4:
                case 5:
                    resultadoTexto = "X";
                    break;

                case 6:
                    resultadoTexto = "2";
                    break;
            }

            out.println(resultadoTexto);
            out.println();
        }

        IntStream intStream2 = random.ints(1, 1, 4);
        Iterator <Integer> iterator2 = intStream2.iterator();

        int resultadoPleno15 = iterator2.next();
        String resultadoPleno15Texto = "";

        switch (resultadoPleno15) {
            case 1:
                resultadoPleno15Texto = "1";
                break;
            case 3:
                resultadoPleno15Texto = "X";
                break;
            case 2:
                resultadoPleno15Texto = "2";
                break;
        }

        out.print("Pleno al Quince: " + resultadoPleno15Texto);
    }
}