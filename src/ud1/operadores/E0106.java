/* Crea una aplicación que calcule la media aritmética de dos notas enteras. Ten en cuenta que la media puede tener decimales. */

package operadores;
import java.util.Scanner;

public class E0106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota entera: ");
        int nota1 = scanner.nextInt();
        System.out.print("Introduce la segunda nota entera: ");
        int nota2 = scanner.nextInt();

        float media = ((nota1 + nota2) / 2.0f);

        System.out.printf("La media aritmética de %d y %d es %.2f", nota1, nota2, media);
    
        scanner.close();
    }
}
