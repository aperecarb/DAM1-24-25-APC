package funciones;

import java.util.Scanner;

public class E0404 {
    public static double maximo(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un número: ");
        double n1 = sc.nextDouble();
        System.out.println("Inserte otro número: ");
        double n2 = sc.nextDouble();

        System.out.println(maximo(n1, n2));

        sc.close();
    }
}
