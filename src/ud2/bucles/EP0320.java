package bucles;

import java.util.Scanner;

public class EP0320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaTotal = 0;
        
        while (true) {
            System.out.print("Introduzca una cantidad de dinero (0 para terminar): ");
            double cantidad = sc.nextDouble();
            
            if (cantidad == 0) {
                break;
            }
            
            sumaTotal += cantidad;
        }
        System.out.printf("La suma total de dinero es: %.2f%n", sumaTotal);

        sc.close();
    }
}
