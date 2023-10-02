package _00_ejercicios_basicos;

public class exercise6 {
    public static void main(String[] args) {
        double baseImponible = 150.0;
        double valorIVA = 0.21;
        double totalFactura = baseImponible * (1 + valorIVA);

        System.out.println("Base Imponible: " + baseImponible);
        System.out.println("Porcentaje de IVA: " + (valorIVA * 100) + "%");
        System.out.println("Total de la factura: " + totalFactura);
    }
}