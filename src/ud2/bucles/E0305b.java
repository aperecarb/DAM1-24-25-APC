/* Variante. Permite al usuario un número limitado de fallos. */

package ejerciciosU2.bucles;
import java.util.Scanner;
import java.util.Random;

public class E0305b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        final int FALLOS = 5;
        int nFallos = 0;
        int sumando1 = 0;
        int sumando2 = 0;
        int respuesta = 0;
        int contador = 0;

        int numero = 0;

        while(nFallos < FALLOS){
            
            sumando1 = random.nextInt(100) + 1;
            sumando2 = random.nextInt(100) + 1;
            respuesta = sumando1 + sumando2;

            System.out.printf("\n%d + %d = ", sumando1, sumando2);
            numero = scanner.nextInt();

            if(respuesta == numero){
                System.out.println("Correcto");
                contador++;
            }else{
                nFallos++;
                System.out.println("\nHas fallado");
                System.out.println("La respuesta correcta era " + respuesta);                
            }
        }

        scanner.close();
        
        System.out.println("\nNúmero de sumas correctas: " + contador);
    }
}
