package ud2.bucles;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        System.out.println("Dígitos del número:");
        while (numero != 0) {
            System.out.println(numero % 10);
            numero /= 10;
        }
        sc.close();
    }
}
