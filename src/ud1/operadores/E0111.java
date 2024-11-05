/* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Escribe una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta y que muestre el importe total siendo 2,35 € el precio del kilo de manzanas y 1,95 el del kilo de peras. */

package operadores;
import java.util.Scanner;

public class E0111 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        float precioManzana = 2.35f;
        float precioPeras = 1.95f; 

        System.out.print("\nVentas de manzanas (kilos) el primer trimestre: ");
        float man1 = scanner.nextFloat();
        System.out.print("Ventas de peras (kilos) el primer trimestre: ");
        float per1 = scanner.nextFloat();

        System.out.print("\nVentas de manzanas (kilos) el segundo trimestre: ");
        float man2 = scanner.nextFloat();
        System.out.print("Ventas de peras (kilos) el segundo trimestre: ");
        float per2 = scanner.nextFloat();

        System.out.print("\nVentas de manzanas (kilos) el tercer trimestre: ");
        float man3 = scanner.nextFloat();
        System.out.print("Ventas de peras (kilos) el tercer trimestre: ");
        float per3 = scanner.nextFloat();

        float beneficios = (man1 + man2 + man3)*precioManzana + (per1 + per2 + per3)*precioPeras;

        System.out.println("El importe total de beneficios anuales en la venta de manzanas y peras es de " + beneficios);
    
        scanner.close();
    }
}
