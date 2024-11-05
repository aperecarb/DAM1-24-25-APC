/* Convertir un número de horas, minutos y segundos introducidos por teclado en un
número total de segundos. */

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce hh mm ss separados por espacios: "); 
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int ss = scanner.nextInt();

        int segundos = hh*3600 + mm*60 + ss;

        System.out.println("El número de segundos total es: " + segundos);
          
        scanner.close();
    }
}
