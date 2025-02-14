public class MétodoValidarInput {
        // Método para leer un entero positivo
    private static int leerEnteroPositivo(Scanner scanner) {
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
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
    private static int leerEnteroEnRango(Scanner scanner, int min, int max) {
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
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
