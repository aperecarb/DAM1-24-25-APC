/* Solicita la edad del usuario y muestra la que tendrá el año que viene. */

package operadores;
import java.util.Scanner;

public class E0103 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.err.printf("El año que viene tendrás %d años", edad+1);
        
        scanner.close();
    }
}