package bucles;

import java.util.Scanner;

public class E0311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;

        System.out.print("Introduzca un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.printf("El factorial de %d es %d", numero, factorial);

        scanner.close();
    }
}