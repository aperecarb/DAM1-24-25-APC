package ejercicios;

import java.util.Scanner;

public class E0205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduzca otro número: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.printf("%d < %d", numero1, numero2);
        } else {
            System.out.printf("%d < %d", numero2, numero1);
        }

        scanner.close();
    }
}
