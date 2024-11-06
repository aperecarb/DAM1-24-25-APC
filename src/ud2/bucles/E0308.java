/* Pedir diez números enteros por teclado y mostrar la media.
 Amplía codificando el número de números como una constante.*/

package bucles;
import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM = 10;
        int numero;
        int suma = 0;

        for (int i = 0; i < NUM; i++){
            System.out.printf("Introduzca el %d número: ", i + 1);
            numero = scanner.nextInt();
            suma = suma + numero;
        }
        scanner.close();
        double media = suma / NUM;
        System.out.println("La media es " + media);
    }
}
