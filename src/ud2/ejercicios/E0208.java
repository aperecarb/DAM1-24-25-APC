/* Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. 
Si no existen, habrá que indicarlo. */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca a b y c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        double discriminante = Math.sqrt(b * b - 4 * a * c);

        if (discriminante > 0){
            double x1 = (- b + discriminante) / (2 * a);
            double x2 = (- b - discriminante) / (2 * a);
            System.out.print("\nSolución1: " + x1);
            System.out.print("\nSolución2: " + x2);
        } else if (discriminante == 0){
            double x = (- b + discriminante) / 2 * a;
            System.out.println("\nSolución: " + x);
        }else{
            System.out.println("No existe solución real");
        }
    }
}
