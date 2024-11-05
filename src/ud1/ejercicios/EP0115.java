/* Convertir un número de segundos introducido por teclado en horas, minutos y
segundos. */

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el numero de segundos: ");
        int segundos = scanner.nextInt();

        int hh = segundos / 3600; 
        int mm = (segundos % 3600) / 60;
        int ss = segundos % 60; 

        System.out.printf("\nHoras: " + hh);
        System.out.printf("\nMinutos: " + mm);
        System.out.println("\nSegundos: " + ss);

        scanner.close();
    }
}