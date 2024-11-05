/* Crea un programa que pida la base y la altura de un triángulo y muestre su área */

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduzca la base del triángulo: ");
        float base = scanner.nextFloat();
        System.out.print("\nIntroduzca la altura del triángulo: ");
        float altura = scanner.nextFloat();

        float area = base * altura / 2;

        System.out.printf("\nEl área del triángulo es %.2f", area);

        scanner.close();
    }
}
