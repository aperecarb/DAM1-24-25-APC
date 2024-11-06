/* Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
 fecha correspondiente al día siguiente. */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca una fecha (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();
        scanner.close();
        
        dia++;

        switch (mes) {
            case 4, 6, 9, 11 -> {
                if (dia > 30){
                    dia = 1;
                    mes++;
                }
            }
            case 1, 3, 5, 7, 8, 10 -> {
                if (dia > 31) {
                    dia = 1;
                    mes++;
                }
            }
                    
            case 12 -> {
                if (dia > 31){
                    dia = 1;
                    mes = 1;
                    año++;
                }
            }
    
            case 2 -> { 
                if (dia > 28) {
                    dia = 1;
                    mes++;
                }
            }
        }

        System.out.printf("Fecha del día siguiente: %02d/%02d/%04d: ", dia, mes, año);
    }
}