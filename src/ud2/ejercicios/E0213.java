package ud2.ejercicios;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la hora (hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();

        segundo++;

        switch (segundo) {
            case 60 -> {
                segundo = 0;
                minuto++;

                switch (minuto) {
                    case 60 -> {
                        minuto = 0;
                        hora++;

                        switch (hora) {
                            case 24 -> hora = 0;
                        }
                    }
                }
            }
        }
        System.out.printf("Hora actual + 1 segundo: %02d:%02d:%02d", hora, minuto, segundo);

        scanner.close();
    }
}
