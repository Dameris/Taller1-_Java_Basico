package Ejercicios_practicar_Java_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del objeto : ");
        double n1 = scanner.nextDouble();
        double n2 = 9.81;
        double sol = Math.sqrt((2*n1)/n2);
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(sol);
        System.out.println("Tardará "+resultado+" segundos en caer");
    }
}
