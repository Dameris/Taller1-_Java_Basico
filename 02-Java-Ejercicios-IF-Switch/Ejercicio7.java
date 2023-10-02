package Ejercicios_practicar_Java_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota : ");
        double primera = scanner.nextDouble();

        System.out.print("Introduce la  segunda nota : ");
        double segunda = scanner.nextDouble();

        System.out.print("Introduce la tercera nota : ");
        double tercera = scanner.nextDouble();

        double nota = ((primera + segunda + tercera) / 3);
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(nota);
        System.out.println("La media de los tres exámenes es "+resultado);
    }
}
