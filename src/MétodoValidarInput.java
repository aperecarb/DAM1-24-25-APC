import java.util.Scanner;

public class MétodoValidarInput {
    private static int validarInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Introduce un número válido.");
            sc.next();
        }
        return sc.nextInt();
    }
}
