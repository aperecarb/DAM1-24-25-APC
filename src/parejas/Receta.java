/* Pilot: Rodrigo Pazos
 * Copilot: Rocío Rial
 */

package parejas;

import java.util.Scanner;

public class Receta {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Compota de manzana");

        int numeroPersonas;

        final double MANZANA, AGUA, AZUCAR,LIMON;

        MANZANA = 1.5 / 6;
        AGUA = 330 / 6;
        AZUCAR = 120 / 6;
        LIMON = 6 / 6;

        System.out.println("Para cuantas personas es la receta? ");
        numeroPersonas = sc.nextInt();
        sc.close();

        System.out.printf("\n Necesitas %.2f kilos de manzana", MANZANA * numeroPersonas);
        System.out.printf("\n Necesitas %.2f mililitros de agua", AGUA * numeroPersonas);
        System.out.printf("\n Necesitas %.2f gramos de azucar", AZUCAR * numeroPersonas);
        System.out.printf("\n Necesitas %.2f mililitros de zumo de limón", LIMON * numeroPersonas);

        final double precioManzana = 1.68;
        final double precioAzucar = 1.80;
        double precioReceta = precioManzana * MANZANA * numeroPersonas + (precioAzucar * (AZUCAR * numeroPersonas) / 1000); 
        System.out.printf("\n El precio de la receta es: %.2f ", precioReceta);

    }
}
