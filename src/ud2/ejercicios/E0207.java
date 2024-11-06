/* Pedir tres números y mostrarlos ordenados de mayor a menor */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int n3 = scanner.nextInt();
        scanner.close();

        if (n1 < n2 && n1 < n3){ 
            if (n2 < n3){
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n1, n2, n3);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n3, n2, n1);
            }else{
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n1, n3, n2);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n2, n3, n1);
            }
        }else if (n2 < n1 && n2 < n3){
            if (n1 < n3){
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n2, n1, n3);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n3, n1, n2);
            } else{
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n2, n3, n1);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n1, n3, n2);
            }
        }else{
            if(n1 < n2){
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n3, n1, n2);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n2, n1, n3);
            } else{
                System.out.printf("\nResultado menor a mayor:  %d %d %d", n3, n2, n1);
                System.out.printf("\nResultado mayor a menor:  %d %d %d", n1, n2, n3);
            }
        }
    }
}
