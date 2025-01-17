package ud4.ejercicios;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tiempos = new ArrayList<>();
        LocalTime inicio = LocalTime.now();
        System.out.println("Presiona Enter para registrar un tiempo e introduce 'F' o 'f' para finalizar.");

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("F")) {
                LocalTime fin = LocalTime.now();
                int tiempoFinal = fin.toSecondOfDay() - inicio.toSecondOfDay();
                tiempos.add(tiempoFinal);
                break;
            } else {
                LocalTime ahora = LocalTime.now();
                int tiempoTranscurrido = ahora.toSecondOfDay() - inicio.toSecondOfDay();
                tiempos.add(tiempoTranscurrido);
            }
        }

        System.out.println("Tiempos: " + tiempos);

        if (!tiempos.isEmpty()) {
            double suma = 0;
            for (int tiempo : tiempos) {
                suma += tiempo;
            }
            double media = suma / tiempos.size();
            System.out.println("Media = " + media);

            int registrosPorEncimaMedia = 0;
            for (int tiempo : tiempos) {
                if (tiempo > media) {
                    registrosPorEncimaMedia++;
                }
            }
            System.out.println("Tiempos superiores a la media: " + registrosPorEncimaMedia);
        }
        sc.close();
    }
}