package bucles;

import java.util.Scanner;

public class EP0313_Reloj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la hora (hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();
        System.out.print("Introduzca cuántos segundos desea incrementar: ");
        int segundoSumar = scanner.nextInt();
        scanner.close();

        segundo = segundo + segundoSumar;

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

        System.out.printf("Hora actual + %d segundo: %02d:%02d:%02d", segundoSumar, hora, minuto, segundo);
    }
}
