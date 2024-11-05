/* Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero que 
son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 
no se considera un número casi-cero. */

package ejercicios2;
import java.util.Scanner;

public class E0204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número decimal: ");  
        double numero = scanner.nextDouble();
        scanner.close();

        if (numero != 0 && numero > -1 && numero < 1){
            System.out.println("El número es un número casi-cero");
        }else{
            System.out.println("El número NO es un casi-cero");
        }
    }
}
