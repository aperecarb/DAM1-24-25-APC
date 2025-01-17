package ud4.ejercicios;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime inicio = LocalTime.now();
        String input;
        int[] tiempos = new int[0];

        System.out.println("Presiona Enter para registrar un tiempo e introduce 'F' o 'f' para finalizar.");

        do {
            input = sc.nextLine();
                LocalTime fin = LocalTime.now();
                int tiempoFinal = fin.toSecondOfDay() - inicio.toSecondOfDay();
                tiempos = Arrays.copyOf(tiempos, tiempos.length + 1);
                tiempos[tiempos.length - 1] = tiempoFinal;
        } while (!input.equalsIgnoreCase("F"));

        System.out.println("Tiempos: " + Arrays.toString(tiempos));

        double suma = 0;
        for (int tiempo : tiempos) {
            suma += tiempo;
        }
        double media = (double) suma / tiempos.length;
        System.out.println("Media = " + media);

        int tiemposSuperiores = 0;
        for (int tiempo : tiempos) {
            if (tiempo > media) {
                tiemposSuperiores++;
            }
        }
        System.out.println("Tiempos superiores a la media: " + tiemposSuperiores);
        sc.close();
    }
}