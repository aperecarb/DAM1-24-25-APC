package ud2.ejercicios;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduzca otro número: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.printf("%d < %d", numero1, numero2);
        } else if (numero2 < numero1) {
            System.out.printf("%d < %d", numero2, numero1);
        } else {
            System.out.println("Los números son iguales");
        }

        scanner.close();
    }
}
