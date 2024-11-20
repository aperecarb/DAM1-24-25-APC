/*  Implementa un programa que pida un número entero y lo muestre dígito a dígito.
Por ejemplo, para el número de entrada 123, deberá mostrar por separado los dígitos 3, 2 y 1. */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0322_Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        String resultado = ""; // Inicializar la cadena de caracteres

        while (numero > 0){
            int digito = numero % 10; // Obtener último dígito
            resultado = digito + ", " + resultado; // Agregar dígito al inicio de la cadena
            numero /= 10; // Eliminar último dígito
        }
        System.out.println("Dígitos por separado: " + resultado);
    }
}
