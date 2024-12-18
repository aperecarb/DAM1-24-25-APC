package ud2.bucles;

import java.util.Scanner;

public class EP0321_MayorMenorNNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int mayor = 0;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.println("\nEl programa terminará al introducir un 0 o número negativo.");
            System.out.print("Introduzca un número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero > 0);
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);

        scanner.close();
    }
}
