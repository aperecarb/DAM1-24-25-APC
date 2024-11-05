/* Solicita el año actual y el año de nacimiento del usuario y muestra la edad del usuario suponiendo que en el año en curso ya haya cumplido años. */

package operadores;
import java.util.Scanner;

public class E0104 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el año actual: ");
        int añoactual = scanner.nextInt();

        System.out.print("Introduzca su año de nacimiento: ");
        int añonacimiento = scanner.nextInt();

        int edad = añoactual-añonacimiento;

        System.out.printf("Tienes %d años.", edad);

        scanner.close();

    }
}
