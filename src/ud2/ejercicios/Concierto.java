package ejercicios;

import java.util.Scanner;

public class Concierto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double CANCELAR = 0.2;
        final double REBAJASI = 0.5;
        final double AREBAJAR = 0.25;

        System.out.print("Introduzca el aforo máximo del concierto: ");
        int aforo = scanner.nextInt();
        System.out.print("Introduzca el precio de la entrada: ");
        double precioEntrada = scanner.nextDouble();
        System.out.print("Introduzca el número de entradas vendidas: ");
        int entradasVendidas = scanner.nextInt();

        double ganancias = entradasVendidas * precioEntrada;
        double aforo20 = aforo * CANCELAR;
        double aforo50 = aforo * REBAJASI;

        if (entradasVendidas < aforo20) {
            System.out.println("\nEl concierto se cancela");
        } else if (entradasVendidas < aforo50) {
            double precioRebajado = precioEntrada - precioEntrada * AREBAJAR;
            System.out.println("\nEl precio de las entradas tendrá una rebaja del 25%");
            System.out.printf("Precio entrada por persona: %.2f\n", precioRebajado);
            System.out.printf("Dinero recaudado: %.2f", precioRebajado * entradasVendidas);
        } else {
            System.out.printf("\nPrecio entrada por persona: %.2f\n", precioEntrada);
            System.out.printf("Dinero recaudado: %.2f", ganancias);
        }
        
        scanner.close();
    }
}
