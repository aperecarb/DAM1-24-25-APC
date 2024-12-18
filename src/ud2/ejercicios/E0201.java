package ud2.ejercicios;

import java.util.Scanner;

public class E0201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }
        if (numero % 2 != 0) {
            System.out.println("El número es impar");
        }
        
        scanner.close();
    }
}
