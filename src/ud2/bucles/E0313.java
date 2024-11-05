/* Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a 4) y suspensos. */

package bucles;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suspenso = 0;
        int aprobado = 0;
        int condicionado = 0;

        for (int i = 0; i < 6; i++){
            System.out.printf("\nIntroduce la calificación del alumno %d: ", i + 1);
            double calificacion = scanner.nextDouble();
            if(calificacion == 4){
                condicionado++;
            }else if (calificacion >= 5){
                aprobado++;
            }else{
                suspenso++;
            }
        }

        scanner.close();

        System.out.println("\nHay " + suspenso + " suspensos");
        System.out.println("\nHay " + condicionado + " condicionados");
        System.out.println("\nHay " + aprobado + " aprobados\n");
    }
}
