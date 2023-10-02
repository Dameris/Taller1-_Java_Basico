package Ejercicios_practicar_Java_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para la ecuación : ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce el otro número para la ecuación : ");
        double n2 = scanner.nextDouble();
        double sol = -n2/n1;
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(sol);
        System.out.println("La x en esta ecuación es : "+resultado);
    }
}
