/* De forma similar a la actividad anterior (EP0317), implementa un algoritmo
que calcule el minimo común múltiplo de dos números dados. 

MCM: |a x b| / (MCD(a, b)) */

package ud2.propuestos.bucles;

import java.util.Scanner;

public class EP0318_MCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números para calcular su MCM: ");
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        scanner.close();

        // |a x b|
        int multiplicacion = Math.abs(a * b);


        // MCD(a, b)
        for(int i = a; i > 0; i--){
            if (a % i == 0 && b % i == 0){
                int mcd = i;
                int mcm = mcd / i;
                System.out.printf("MCM(%d, %d) = %d", a, b, mcm);
                break;
            }
        }
    }
}
