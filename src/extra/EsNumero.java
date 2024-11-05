package extra;
/* Escribe un programa que lea un carácter de teclado e imprima por pantalla si se trata de un número, de una letra mayúscula, de una letra minúscula o si no es nada de eso.

Utiliza el operador ternario para imprimir la salida. */

import java.util.Scanner;

public class EsNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el carácter
        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Obtener el valor ASCII del carácter
        int ascii = (int) caracter;

        // Usar el operador ternario para determinar el tipo de carácter usando el valor ASCII
        String resultado = (ascii >= 48 && ascii <= 57) ? "Es un número" :
                           (ascii >= 65 && ascii <= 90) ? "Es una letra mayúscula" :
                           (ascii >= 97 && ascii <= 122) ? "Es una letra minúscula" :
                           "No es ni un número, ni una letra mayúscula o minúscula";

        // Imprimir el resultado
        System.out.println(resultado);

        scanner.close();
    }
}
