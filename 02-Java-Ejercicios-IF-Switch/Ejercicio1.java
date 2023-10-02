package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Di un día de la semana : ");
        String dia = scanner.next();
        switch (dia){
            case "lunes" :
                System.out.println("Desarrollo web en entorno servidor");
                break;
            case "martes" :
                System.out.println("Despliege de aplicaciones");
                break;
            case "miércoles" :
                System.out.println("Desarrollo web en entorno cliente");
                break;
            case "jueves" :
                System.out.println("Empresar");
                break;
            case "viernes" :
                System.out.println("Diseñor");
                break;
        }
    }
}
