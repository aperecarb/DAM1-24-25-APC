/* Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n. */

package ejerciciosU2.bucles;
import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
