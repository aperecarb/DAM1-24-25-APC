package funciones;

import java.util.Scanner;

public class E0406 {
    public static boolean esPrimo(int n) {
        boolean primo = true;

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }

        sc.close();
    }
}
