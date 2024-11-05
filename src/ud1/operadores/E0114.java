/* Escribe un programa que solicite por teclado un número decimal y lo redondee al entero más próximo. */

package operadores;
import java.util.Scanner;

public class E0114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba un número decimal: ");
        double numero = scanner.nextDouble();

        int nRedondeado = (int) Math.round(numero);

        System.out.print("El número redondeado: " + nRedondeado);

        scanner.close();
    }
}
