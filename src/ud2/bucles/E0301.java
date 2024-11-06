/* Diseñar un programa que muestre, para cada número introducido por teclado, si
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0. */

package bucles;
import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = 1;

        while(numero != 0){
        System.out.println("\nIntroduzca un número");
        numero = scanner.nextInt();

        String parImpar = (numero % 2 == 0) ? "" : "im";
        String positivoNegativo = (numero >= 0) ? "positivo" : "negativo";
        int cuadrado = numero * numero;

        System.out.printf("\nEl número %d es %spar", numero, parImpar);
        System.out.printf("\nEl número %d es %s", numero, positivoNegativo);
        System.out.
        printf("\nEl cuadrado de %d es %d\n", numero, cuadrado);
        }
        scanner.close();
    }
}
