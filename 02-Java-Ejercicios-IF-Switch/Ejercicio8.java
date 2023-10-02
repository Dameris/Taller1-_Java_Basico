package Ejercicios_practicar_Java_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
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
        String r = "";
        if (nota<5){
            r="Insuficiente";
        }
        if (nota==5){
            r="suficiente";
        }
        if (nota>5&&nota<7){
            r="bien";
        }
        if (nota>=7&&nota<10){
            r="notable";
        }
        if (nota==10){
            r="sobresaliente";
        }
        System.out.println("La media de los tres exámenes es "+resultado+" tienes un "+r);
    }
}
