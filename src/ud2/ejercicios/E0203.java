/* Solicitar dos números distintos y mostrar cuál es el mayor */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número entero: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduzca un número entero distinto: ");
        int n2 = scanner.nextInt();
        scanner.close();

        if(n1 > n2){
            System.out.print("El número mayor es " + n1);
        }else{
            System.out.print("El número mayor es " + n2);
        }
    }
}
