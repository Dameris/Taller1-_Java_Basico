package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el día : ");
        int n1 = scanner.nextInt();
        System.out.print("Dime la hora: ");
        int n2 = scanner.nextInt();
        System.out.print("Dime los minutos : ");
        int n3 = scanner.nextInt();
        if (n3>=60){
            n2=n2+n3/60;
            n3=n3-(n3/60)*60;
        }
        if (n2>=24){
            n1=n1+n2/24;
            n2=n2-(n2/24)*24;
        }
        if (n1==5 && n2>=15){
            System.out.println("Ya es fin de semana!");
        }else{
            int fds=5*24*60+15*60;
            int intr=n1*24*60+n2*60+n3;
            fds=fds-intr;
            System.out.print("Quedan "+fds+" minutos para el fin de semana");
        }
    }
}
