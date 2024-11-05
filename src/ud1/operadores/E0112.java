/* Escribe un programa que pida un número entero al usuario y muestre su valor absoluto.  */

package operadores;

import java.util.Scanner;

public class E0112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();

        if(numero>0){
            System.out.print("Valor absoluto: " + numero);
        } else{
            System.out.print("Valor absoluto: " + -numero);

        }

        scanner.close();
    }
}
