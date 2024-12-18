package ud2.bucles;

import java.util.Scanner;

public class EP0314_Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        int primo = 0;

        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;

            if (i > 2) {
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
            }

            System.out.printf("%d - %sprimo\n", i, esPrimo ? "" : "no ");

            if (esPrimo) {
                primo++;
            }
        }
        System.out.printf("\nResultan un total de %d números primos.", primo);

        scanner.close();
    }
}
