/* Pedir dos números y mostrarlos ordenados de forma decreciente */

package ud2.condicionales;
import java.util.Scanner;

public class E0205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduzca un segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 < numero2){
            System.out.printf("%d < %d", numero1, numero2);
        }else {
            System.out.printf("%d < %d", numero2, numero1);  
        }
    }
}
