/* Para dos números dados, a y b, es posible buscar el máximo común
divisor (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero
sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer número que
divide a ambos simultáneamente. Realiza un programa que calcule el máximo común
divisor de dos números. */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0317_MCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números para calcular su MCD: ");
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        scanner.close();

        for(int i = a; i > 0; i--){
            if (a % i == 0 && b % i == 0){
                System.out.printf("MCD(%d, %d): %d", a, b, i);
                break;
            }
        }
    }
}
