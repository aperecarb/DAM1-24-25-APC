/* Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, 
mostrando el resultado por pantalla. */

import java.util.Scanner;

public class EP0122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca los grados Fahrenheit que quiere convertir: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0/9.0)*(fahrenheit-32);  // La división son numeros double, sino coge el int partido
        System.out.printf("\n%.2f ºF son %.2f ºC", fahrenheit, celsius);

        scanner.close();
    } 
}
