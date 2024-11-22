package bucles;

import java.util.Scanner;

public class EP0319_Raiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cuadrado = 0;

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        while (cuadrado * cuadrado < numero) {
            cuadrado++;
        }
        int resto = numero - (cuadrado * cuadrado);

        if (resto != 0) {
            cuadrado = cuadrado - 1;
            resto = numero - (cuadrado * cuadrado);
        }
        System.out.printf("La raíz cuadrada de %d es %d con un resto de %d", numero, cuadrado, resto);
    }
}
