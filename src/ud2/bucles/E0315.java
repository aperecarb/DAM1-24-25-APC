package ud2.bucles;

import java.util.Scanner;

public class E0315 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
