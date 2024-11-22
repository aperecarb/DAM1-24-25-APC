package ejercicios;

import java.util.Scanner;

public class E0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduzca otro número entero: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.printf("Los números son iguales");
        } else {
            System.out.printf("Los números son distintos");
        }
        
        scanner.close();
    }
}
