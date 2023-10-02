package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce algo ");
        String p1 = scanner.next();
        System.out.print("Donde quieres que este el vértice de la pirámide : \n" +
                "arriba \n" +
                "abajo\n" +
                "izquierda\n" +
                "derecha\n" +
                "");
        String dir = scanner.next();
        if (dir.equals("arriba")){
            System.out.println("  " + p1);
            System.out.println(" " + p1 + p1 + p1);
            System.out.println(p1 + p1 + p1 + p1 + p1);
        }
        if (dir.equals("abajo")){
            System.out.println(p1 + p1 + p1 + p1 + p1);
            System.out.println(" " + p1 + p1 + p1);
            System.out.println("  " + p1);
        }
        if (dir.equals("izquierda")){
            System.out.println("    " + p1);
            System.out.println("  " + p1 + " " + p1);
            System.out.println(p1 + " " + p1 + " " + p1);
            System.out.println("  " + p1 + " " + p1);
            System.out.println("    " + p1);

        }
        if (dir.equals("derecha")){
            System.out.println(p1);
            System.out.println(p1 + " " + p1);
            System.out.println(p1 + " " + p1 + " " + p1);
            System.out.println(p1 + " " + p1);
            System.out.println(p1);
        }
    }
}
