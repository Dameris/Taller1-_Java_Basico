package _01_ejercicios_entrada_salida;

import static java.lang.System.out;

public class exercise8 {
    public static void main(String[] args) {
        int horasTrabajadas = 40;
        int eurosHora = 12;
        int salarioSemana = horasTrabajadas * eurosHora;

        out.println("El salario semanal, de " + horasTrabajadas + " horas trabajadas a " + eurosHora + "€ la hora, es de " + salarioSemana + "€");
    }
}