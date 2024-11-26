package ejercicios;

import java.util.Scanner;

public class EstructurasDeControl_IF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número y calcularé si es par o impar:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
        
        scanner.close();
    }

}
