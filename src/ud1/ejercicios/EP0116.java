/* Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.

Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
centimetros). */

import java.util.Scanner;

public class EP0116 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nIntroduce una medida en milímetros: ");
    double milimetros = scanner.nextDouble();

    System.out.print("\nIntroduce una medida en centimetros: ");
    double centimetros = scanner.nextDouble();

    System.out.print("\nIntroduce una medida en metros: ");
    double metros = scanner.nextDouble();

    double suma = (milimetros/10) + centimetros + (metros*100);

    System.out.println("\nLa suma total en centimetros es " + suma);

    scanner.close();
    }
}
