package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        while (!entradaValida) {
            System.out.print("Introduzca un número entero: ");
            try {
                numero = scanner.nextInt();
                entradaValida = true;
                System.out.println("El número introducido es: " + numero);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe introducir un número entero.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
