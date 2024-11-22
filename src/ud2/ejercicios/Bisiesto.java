package ejercicios;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un año: ");
        int año = scanner.nextInt();

        if (año % 4 == 0 && año % 100 != 0 && año % 400 != 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año NO es bisiesto");
        }
        
        scanner.close();
    }
}
