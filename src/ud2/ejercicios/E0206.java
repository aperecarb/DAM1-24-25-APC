/* Realizar de nuevo la actividad 3 considerando el caso de que los números introducidos sean iguales */

package ejercicios2;
import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduzca un segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 < numero2){
            System.out.printf("%d < %d", numero1, numero2);
        }else if (numero2 < numero1) {
            System.out.printf("%d < %d", numero2, numero1);
        }else{
            System.out.println("Los números son iguales");
        }
    }
}
