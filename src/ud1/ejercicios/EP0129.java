/* Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7 

    A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7
    A 13 hay que sumarle 1 para que el resultado (2+5=7) sea múltiplo de 7
    A 14 no hay que sumarle nada (0) para que sea múltiplo de 7
*/

import java.util.Scanner; 

public class EP0129 {
    public static void main(String[] args) {

        // Cantidad que hay que sumarle para que el resultado sea múltiplo de 7
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int resto = numero % 7;
        int suma = (resto == 0) ? 0 : (7 - resto);


        String mensaje = (resto  != 0) 
        ? String.format("\nA %d hay que sumarle %d para que el resultado (%d+%d=%d) sea múltiplo de 7", numero, suma, numero, suma, numero + suma) 
        : String.format("\nA %d no hay que sumarle nada (0) para sea múltiplo de 7", numero);
        System.out.println(mensaje);


        // Es múltiplo de 7 o no
        String esMúltiplo = (numero % 7 == 0) ? "\nEs múltiplo de 7\n" :
                                                "\nNo es múltiplo de 7\n";

        System.out.println(esMúltiplo);
    }
}
