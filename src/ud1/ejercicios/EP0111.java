/* Un economista te ha encargado un programa para realizar cálculos con el IVA. La
aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
el importe correspondiente al IVA y al total. */

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el precio del artículo que quieres comprar: ");
        float precio = scanner.nextFloat();

        System.out.print("¿De cuánto es el IVA del producto?");
        float iva = scanner.nextFloat();

        float importe = precio + iva/100* precio;


        System.out.print("Importe correspondiente al IVA " + iva);
        System.out.print("El precio final es: " + importe);

        scanner.close();
    }
}
