/* Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */

package ejerciciosU2.bucles;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suspenso = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("\nIntroduce la calificación del alumno %d: ", i + 1);
            double calificacion = scanner.nextDouble();
            if(calificacion < 5){
                suspenso++;
            }
        }

        scanner.close();

        System.out.println("\nHay " + suspenso + " suspensos");
    }
}
