package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int ps = 0;
        String resp ;
        System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        resp = scanner.next();
        if (resp.equals("b")) {
            ps++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.print("=> ");
        resp = scanner.next();
        if (resp.equals("c")) {
            ps++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
        System.out.println("a) href\nb) a\nc) link");
        System.out.print("=> ");
        resp = scanner.next();
        if (resp.equals("b")) {
            ps++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a) /etc\nb) /config\nc) /cfg");
        System.out.print("=> ");
        resp = scanner.next();
        if (resp.equals("a")) {
            ps++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.print("=> ");
        resp = scanner.next();
        if (resp.equals("a")) {
            ps++;
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("\nTienes " + ps + " puntos.");
    }
}
