/* Pilot: Rocío Rial
 * Copilot: Rodrigo Pazos
 */

package parejas;

import java.util.Scanner;

public class Asistencia {
    public static void main(String[] args) {
        final int MINUTOS = 240 * 60;
        final double APERCIBIMIENTO = 0.06;
        final double PERDIDAEV = 0.10;
        final double SESIONES = MINUTOS / 50;

        double sesiones06 = SESIONES * APERCIBIMIENTO; 
        double sesiones10 = SESIONES * PERDIDAEV; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de faltas del alumno: ");
        int faltas = sc.nextInt();
        sc.close();

        System.out.println("Número de sesiones de 50': " + SESIONES);
        System.out.println("Número de faltas sin justificar que implican un apercebimiento: " + sesiones06);
        System.out.println("Número de faltas sin justificar que implican una pérdida de la evaluación continua: " + sesiones10);

        String consecuencias = (faltas<sesiones06) ? "Ningún problema": 
                                (faltas<sesiones10) ? "Apercibimiento" :
                                                    "Pérdida de evaluación continua";
        
        System.out.println(consecuencias);

    }
}
