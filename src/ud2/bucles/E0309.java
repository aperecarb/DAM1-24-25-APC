/* Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. 
Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número 
introducido se encuentra en el rango establecido. */

package bucles;
import java.util.Scanner;

public class E0309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do{
        System.out.print("\nIntroduzca un número del 1 al 10: ");
        numero = scanner.nextInt();

        if(numero > 10 || numero < 1){
            System.out.println("No has ingresado un número del 1 al 10.\nVuelve a intentarlo.\n");
        }

        }while (numero > 10 || numero < 1);

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", numero, i, numero * i);
        }

        scanner.close();
    }  
}