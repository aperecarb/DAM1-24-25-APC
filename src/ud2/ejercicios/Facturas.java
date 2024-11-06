/* Escribe un programa para emitir la factura de compra de un producto, introduciendo el precio del producto
y el número de unidades compradas. La factura deberá añadir al total un IVA de 21%. Si el precio final con IVA es 
superior a 100 euros se implicará un descuento del 5% */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        final double IVA =  0.21;
        final double DESCUENTO =  0.05;

        System.out.print("Introduzca el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Introduzca las unidades compradas: ");
        int unidades = scanner.nextInt();
        scanner.close();

        double precioSinIVA = precioProducto * unidades;
        double precioTotal = precioSinIVA + precioSinIVA*IVA;

        if (precioTotal > 100){
            precioTotal = precioTotal - precioTotal*DESCUENTO;
        }

        System.out.printf("Precio = %.2f euros, Unidades = %d => Precio Final = %.2f euros", precioProducto, unidades, precioTotal);
    }
}
 
