package extra;
/* Desarrolla un programa que calcule la media de las notas de un alumno. Permite al usuario ingresar varias notas 
(hasta que ingrese -1 para terminar). El programa debe calcular y mostrar la media de las notas ingresadas.

Salida:
Mostrar la media y cuántas notas fueron ingresadas. */

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double suma = 0; 
        int contador = 0;
        double nota;

        System.out.print("Introduzca varias notas para calcular su media (ingresando -1 para finalizar): ");
        while (true){
            nota = scanner.nextDouble();

            if (nota == -1){
                break; // Romper el ciclo si se ingresa -1
            }

            suma += nota; 
            contador++;
        }

        scanner.close();

        // Calcular la media
        if (contador > 0){
            double media = suma / contador;
            System.out.printf("La media de las %d notas es %.2f", contador, media);
        }else{
            System.out.println("No se ingresaron notas");
        }
    }
}
