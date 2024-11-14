/* Crear una función que, mediante un booleano, indique si el carácter que
se le pasa como parámetro de entrada corresponde a una vocal. */

package funciones;

import java.util.Scanner;

public class E0405_EsVocal {
    public static boolean EsVocal(char letra) {

        letra = Character.toLowerCase(letra);

        boolean esVocal = false;

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            esVocal = true;
        }

        return esVocal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduzca una letra: ");
        char letra = scanner.next().charAt(0);
        scanner.close();

        if (EsVocal(letra)) {
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " no es una vocal");
        }
        System.out.println();
    }
}
