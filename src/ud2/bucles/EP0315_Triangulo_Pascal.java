/* Diseña una aplicación que dibuje el triángulo de Pascal, para n
filas. Numerando las filas y elementos desde 0, la fórmula para obtener el m-ésimo
elemento de la n-ésima fila es
E(n, m) = n! / m!(n - m)!
Donde n! es el factorial de n.
Un ejemplo de triángulo de Pascal con 5 filas (n = 4) es :
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1 */

package ud2.propuestos.bucles;

import java.util.Scanner;

public class EP0315_Triangulo_Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el número de filas: ");
        int filas = scanner.nextInt();
        scanner.close();
        for(int i = 0; i < filas; i++){
            for (int j = 0; j < i; j++){
                
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
