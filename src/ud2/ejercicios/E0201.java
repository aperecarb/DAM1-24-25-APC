/* Diseña una aplicación que solicite un número al usuario e indique si es par o impar */

package ejercicios2;
import java.util.Scanner;

public class E0201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2  == 0){
            System.out.println("El número es par");
        }
        if (numero % 2  != 0){
            System.out.println("El número es impar");
        }
    }
}
