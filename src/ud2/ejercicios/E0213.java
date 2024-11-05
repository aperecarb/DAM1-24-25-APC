/* Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
 segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
 hora actual (10:41:59) => hora actual + 1 segundo (10:42:00) */

package ejercicios2;
import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca la hora (hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();
        scanner.close();

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
    }
}
