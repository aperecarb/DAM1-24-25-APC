/* Pedir un número y calcular su factorial. Por ejemplo el factorial de 5 se denota 5! y es igual a 5 x 4 x 3 x 2 x 1 = 120. */

package bucles;
import java.util.Scanner;

public class E0311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1; // Inicializar en 1 para que la multiplicación no dé 0

        System.out.print("Introduzca un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        for(int i = numero; i > 0; i--){
            factorial = factorial * i;
        }

        System.out.printf("El factorial de %d es %d", numero, factorial);
    }
}
