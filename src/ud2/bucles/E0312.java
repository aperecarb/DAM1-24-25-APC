package bucles;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 5;
        boolean haySuspensos = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            System.out.print("Introduzca la nota del alumno " + i + ": ");
            int nota = sc.nextInt();
            if (nota < 5)
                haySuspensos = true;
        }
        
        if (haySuspensos) {
            System.out.println("Hubo suspensos.");
        } else {
            System.out.println("No hubo ningun suspenso.");
        }
        sc.close();
    }
}
