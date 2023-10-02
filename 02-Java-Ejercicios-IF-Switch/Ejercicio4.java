package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas esta semana : ");
        int n1 = scanner.nextInt();
        int n2 = 12;
        int salario = 0;
        if (n1<=40) {
            salario = n1*n2;
        }
        if (n1>40){
            n1=n1-40;
            salario=40*n2;
            salario=salario+n1*16;
        }
        
        System.out.println("Tu salario esta semana es de "+ salario);
    }
}
