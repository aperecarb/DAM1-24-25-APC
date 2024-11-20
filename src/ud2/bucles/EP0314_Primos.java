/* Realiza un programa que nos pida un número n, y nos diga cuántos
números hay entre 1 y n que sean primos. Un número primo es aquel mayor que 1 y que
solo es divisible por 1 y por él mismo. Veamos un ejemplo para n = 8. */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0314_Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        int primo = 0;
        
        for(int i = 2; i <= numero; i++){
            boolean esPrimo = true; // Es primo
            
            if (i > 2){ // Sino pilla 2 como número no primo
                for(int j = 2; j <= Math.sqrt(numero); j++){
                    if(i % j == 0){
                        esPrimo = false;
                    }
                }
            }

            System.out.printf("%d - %sprimo\n", i, esPrimo ? "" : "no ");

            if(esPrimo){
                primo++;
            }
        }

        System.out.printf("\nResultan un total de %d números primos.", primo);
    }
}
