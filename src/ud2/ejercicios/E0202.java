/* Pedir dos números enteros y decir si son iguales o no */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número enteros: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduzca otro número enteros: ");
        int n2 = scanner.nextInt();
        scanner.close();

        if (n1 == n2){
            System.out.printf("Los números son iguales");
        }else{
            System.out.printf("Los números son distintos");
        }
    }
}
