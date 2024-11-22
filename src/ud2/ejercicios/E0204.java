package ejercicios;

import java.util.Scanner;

public class E0204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número decimal: ");
        double numero = scanner.nextDouble();

        if (numero != 0 && numero > -1 && numero < 1) {
            System.out.println("El número es un número casi-cero");
        } else {
            System.out.println("El número NO es un casi-cero");
        }

        scanner.close();
    }
}
