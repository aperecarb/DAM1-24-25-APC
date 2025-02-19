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

    // Método para leer número entero
    static int leerEntero(int min, int max) {
        int num = -1;
        boolean numCorrecto = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                num = sc.nextInt();
                if (num < min || num > max) {
                    System.out.printf("Debe ser un número entero entre %d y %d%n", min, max);
                } else {
                    numCorrecto = true;
                }
            } catch (Exception e) {
                System.out.printf("Debe ser un número entero entre %d y %d%n", min, max);
                sc.nextLine();
            }
        } while (!numCorrecto);
        return num;
    }
}
