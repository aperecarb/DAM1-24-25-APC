package bucles;

import java.util.Scanner;

public class EP0322_Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        String resultado = "";

        while (numero > 0) {
            int digito = numero % 10;
            resultado = digito + ", " + resultado;
            numero /= 10;
        }
        System.out.println("Dígitos por separado: " + resultado);

        scanner.close();
    }
}
