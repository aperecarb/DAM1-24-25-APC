/* Álvaro Pereira Carballo */
package ud2.apcexamenrec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estatura = 0, numAlumnos = 0, sumEstatura = 0, estaturaMax = 0, estaturaMin = Integer.MAX_VALUE;
        boolean repetir;

        /* Entrada de datos */
        System.out.println("Introduce las estaturas de los alumnos (número negativo para terminar):");

        /* Leemos y capturamos de excepción */
        do {
            repetir = false;
            try {
                while (estatura >= 0) {
                    estatura = sc.nextInt();
                    if (estatura >= 0) {
                        numAlumnos++;
                        sumEstatura += estatura;
                    }
                    if (estatura > estaturaMax) {
                        estaturaMax = estatura;
                    }
                    if (estatura < estaturaMin && estatura >= 0) {
                        estaturaMin = estatura;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, inténtalo de nuevo. " + e.toString());
                sc.next();
                repetir = true;
            }
        } while (repetir);
        /* Calculamos la estatura media */
        if (numAlumnos > 0) {
            double mediaEstatura = (sumEstatura / numAlumnos);
        /* Resultados, formateando correctamente la altura media en metros */
            System.out.println("Número de alumnos: " + numAlumnos);
            System.out.println("Media de las estaturas de los alumnos: " + mediaEstatura  / 100 + " metros.");
            System.out.println("Estatura mayor: " + estaturaMax);
            System.out.println("Estatura menor: " + estaturaMin);
        } else {
            System.out.println("No has introducido ninguna estatura válida.");
        }
        sc.close();
    }
}