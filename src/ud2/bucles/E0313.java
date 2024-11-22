package bucles;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        final int NUM_NOTAS = 6;

        int naprobados = 0;
        int ncondicionados = 0;
        int nsuspensos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca " + NUM_NOTAS + " notas: ");

        for (int i = 1; i <= NUM_NOTAS; i++) {
            int nota = sc.nextInt();
            switch (nota) {
                case 5, 6, 7, 8, 9, 10 -> naprobados++;
                case 4 -> ncondicionados++;
                case 0, 1, 2, 3 -> nsuspensos++;
            }
        }
        sc.close();

        System.out.println("Aprobados: " + naprobados);
        System.out.println("Condicionados: " + ncondicionados);
        System.out.println("Suspensos: " + nsuspensos);
    }
}
