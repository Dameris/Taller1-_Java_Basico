package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora que es : ");
        int n1=scanner.nextInt();
        System.out.println("Introduce el minuto que toca : ");
        int n2=scanner.nextInt();
        if (n2>=60){
            n1=n1+n2/60;
            n2=n2-(n2/60)*60;
        }
        if (n1>=24){
            n1=n1-(n1/24)*24;
        }
        int medianoche = 60*60*24;
        int segact= n1*3600 + n2*60;
        int tiemrest = medianoche-segact;
        System.out.println("Faltan exactamente "+tiemrest+" segundos para la medianoche");
    }
}
