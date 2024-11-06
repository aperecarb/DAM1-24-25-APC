/* Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir 
la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. Mientras la solución sea 
correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones 
realizadas correctamente.

Amplía el programa para que muestre el número de aciertos al terminar.

Variante. Permite al usuario un número limitado de fallos. */

package ejerciciosU2.bucles;
import java.util.Scanner;
import java.util.Random;

public class E0305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int sumando1 = 0;
        int sumando2 = 0;
        int respuesta = 0;
        int contador = -1;

        int numero = 0;
            while(respuesta == numero){
                sumando1 = random.nextInt(100) + 1;
                sumando2 = random.nextInt(100) + 1;
                respuesta = sumando1 + sumando2;

                System.out.printf("\n%d + %d = ", sumando1, sumando2);
                numero = scanner.nextInt();
                contador++;
            }

        scanner.close();
        
        System.out.println("\nHas fallado");
        System.out.println("La respuesta correcta era " + respuesta);
        System.out.println("\nNúmero de sumas correctas: " + contador);
    }
}
