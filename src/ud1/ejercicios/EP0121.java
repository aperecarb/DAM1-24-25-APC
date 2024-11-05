/* Convertir una temperatura introducida por teclado en grados Celsius o centígrados a grados Farenheit, 
mostrando el resultado por pantalla. */

import java.util.Scanner;

public class EP0121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca los grados celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * (9.0/5.0) + 32;  // La división son numeros double, sino coge el int partido
        System.out.println(celsius + " ºC son " + fahrenheit + " ºF");

        scanner.close();
    } 
}
