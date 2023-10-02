package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un número : ");
        int n1 = scanner.nextInt();
        System.out.print("Dime otro número : ");
        int n2 = scanner.nextInt();
        System.out.print("Dime un último número : ");
        int n3 = scanner.nextInt();
        int m ;
        if (n1<n2){
            m=n1;
            n1=n2;
            n2=m;
        }
        if (n2<n3){
            m=n2;
            n2=n3;
            n3=m;
        }
        if (n1<n2){
            m=n1;
            n1=n2;
            n2=m;
        }
        System.out.print("El número más grande es "+n1+" seguido de "+n2+" y el más pequeño es "+n3);
    }
}
