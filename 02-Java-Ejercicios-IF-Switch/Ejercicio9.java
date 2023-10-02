package Ejercicios_practicar_Java_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para la ecuación : ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce otro número para la ecuación : ");
        double n2 = scanner.nextDouble();
        System.out.print("Introduce el último número para la ecuación : ");
        double n3 = scanner.nextDouble();
        double raiz = (n2 * n2) - (4 * n1 * n3);
        double sol = (-n2 + (Math.sqrt(raiz))) / (2 * n1);
        double sol2 = (-n2 - (Math.sqrt(raiz))) / (2 * n1);
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(sol);
        String resultado2 = formato.format(sol2);
        System.out.println("Las soluciones de esta ecuación son " + resultado + " y " + resultado2);
    }
}

