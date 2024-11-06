/* Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
La aplicación tendrá que indicar si el número introducido es capicúa */

package ejerciciosU2.propuestos.condicionales;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        final int MIN = 0;
        final int MAX = 9999;
        int numero;

        do{
        System.out.print("Introduzca un número comprendido entre 0 y 9999: ");
        numero = scanner.nextInt();
        }while (numero < MIN || numero > MAX); // Pedir un número hasta que esté entre 0 y 9999

        scanner.close();

        int numeroOriginal = numero; // temporal
        int numeroInvertido = 0; // Definir a 0 para evitar errores

        // Invertir el número
        while (numero != 0){
            int digito = numero % 10; // Sacar un dígito de la cadena
            numeroInvertido = numeroInvertido * 10 + digito; // Desplazar el dígito
            numero = numero / 10; // Eliminar el último dígito de la cadena original
        }

        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número invertido: " + numeroInvertido);

        // Verificar si es capicúa
        if (numeroOriginal == numeroInvertido){
            System.out.println("El número es capicúa");
        }else{
            System.out.println("El número NO es capicúa");
        }
    }
} 