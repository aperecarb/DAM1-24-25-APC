/* Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos
de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
* * * *
* * *
* *
*                                                                               */

package bucles;
import java.util.Scanner;

public class E0315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        for(int i = numero; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
