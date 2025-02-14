import java.util.Scanner;

public class MétodoValidarInput {
    // Método para leer un entero positivo
    private static int leerEnteroPositivo(Scanner sc) {
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero > 0) {
                    return numero;
                }
                System.out.print("Por favor, introduce un número positivo: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada no válida. Introduce un número válido: ");
            }
        }
    }

    // Método para leer un número dentro de un rango específico
    private static int leerEnteroEnRango(Scanner sc, int min, int max) {
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero >= min && numero <= max) {
                    return numero;
                }
                System.out.print("Número fuera de rango. Introduce un valor entre " + min + " y " + max + ": ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada no válida. Introduce un número válido: ");
            }
        }
    }
}
