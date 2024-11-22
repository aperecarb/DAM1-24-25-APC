package bucles;

import java.util.Scanner;

public class E0309 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entre 1 y 10: ");
        numero = sc.nextInt();

        while (!(numero >= 1 && numero <= 10)) {
            System.out.println("El número no está entre 1 y 10.");
            System.out.println("Por favor escribe otro número: ");
            numero = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
        sc.close();
    }
}
