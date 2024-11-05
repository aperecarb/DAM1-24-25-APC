/*  Programa que pida un número entero al usuario y que indique si es par mediante un literal booleano (true o false). */

package operadores;

import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        boolean par = (numero % 2) == 0;

        if(par){
            System.out.print("El número es par");
        } else{
            System.out.print("El número es impar");

            scanner.close();
        }
    }
}
