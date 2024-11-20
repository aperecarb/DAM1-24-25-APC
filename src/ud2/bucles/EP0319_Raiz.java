/* Calcula la raíz cuadrada de un número natural mediante aproximaciones. En
el caso de que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada
de 23, probamos 
1^2 = 1, 
2^2 = 4, 
3^2 = 9, 
4^2 = 16, 
5^2 = 25 (nos pasamos), 
resultando 4 la raiz cuadrada de 23 con un resto (23 - 16) de 7.
 */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0319_Raiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cuadrado = 0;

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        while (cuadrado * cuadrado < numero){
            cuadrado++;
        }

        int resto = numero - (cuadrado * cuadrado);

        if(resto != 0){
            cuadrado = cuadrado - 1; 
            resto = numero - (cuadrado * cuadrado);
        }

        System.out.printf("La raíz cuadrada de %d es %d con un resto de %d", numero, cuadrado, resto);
        
    }
}
