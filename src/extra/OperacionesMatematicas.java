/* Escribe un programa que reciba dos números y un operador (+, -, *, /) e imprima el resultado de la operación. */

package extra;
import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduzca otro número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduzca la operación que quiera realizar (+, -, *, /): ");
        char operador = scanner.next().charAt(0); // 
        scanner.close();

        switch (operador) {
            case '+':
                System.out.printf("Suma: %d", (num1 + num2));
                break;
            case '-':
                System.out.printf("Resta: %d", (num1 - num2));
                break;
            case '*':
                System.out.printf("Multiplicación: %d", (num1 * num2));
                break;
            case '/':
            if(num2 != 0) {
                System.out.printf("División: %d", (num1 / num2));
            }else{
                System.out.println("No se puede dividir entre 0");
            }
                break;
        
            default:
                System.out.println("Operador no válido");
                break;
        }
    }
}
