package Ejercicios_practicar_Java_2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String resp;
        int ps= 0;
        System.out.print("Crees que tu pareja te esta siendo infiel ? ");
        String test = scanner.next();
        if(test.equals("si")){
            System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
            resp = scanner.next();
            if ( resp.equals("v") ) {
                ps += 3;
            }

            if ( ps <= 10 ) {
                System.out.print("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
            }

            if ( (ps > 11 ) && (ps <= 22) ) {
                System.out.print("\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            }

            if ( ps >= 22 ) {
                System.out.print("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
            }
        }
    }
}
