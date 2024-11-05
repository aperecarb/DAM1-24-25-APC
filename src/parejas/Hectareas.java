/* Pilot: Rocío Rial
 * Copilot: Rodrigo Pazos
 */

package parejas;

import java.util.Scanner;

public class Hectareas {
    public static void main(String[] args) {
        final double HECTAREA = 100 * 100;
        final double CFUTBOL = 105 * 70;
        final double CBALONCESO = 28 * 15;
        final double CTENIS = 23.77 * 10.97;
        final double RETIRO = 125 * HECTAREA;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de hectáreas: ");
        double superficie = sc.nextDouble();
        sc.close();

        double aFutbol = (superficie*HECTAREA/CFUTBOL);
        double aBaloncesto = (superficie*HECTAREA/CBALONCESO);
        double aTenis = (superficie*HECTAREA/CTENIS);
        double aRetiro = (superficie*HECTAREA/RETIRO);

        System.out.printf("\n%.2f hectáreas son %.2f campos de fútbol", superficie, aFutbol);
        System.out.printf("\n%.2f hectáreas son %.2f canchas de baloncesto", superficie, aBaloncesto);
        System.out.printf("\n%.2f hectáreas son %.2f pistas de tenis", superficie, aTenis);
        System.out.printf("\n%.2f hectáreas son %.2f parques del retiro", superficie, aRetiro);
    }
}
