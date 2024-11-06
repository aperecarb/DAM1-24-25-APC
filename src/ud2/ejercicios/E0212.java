/* Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
 tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
 bisiestos). */

package ejerciciosU2.condicionales;
import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca una fecha (dd mm aaaa); ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();
        scanner.close();

        if (mes < 1 || mes > 12){
            System.out.println("Fecha incorrecta");
            return; // Salir del programa si es inválido
        }

        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia < 1 || dia > 31){
                    System.out.println("Fecha inválida");
                    return; // Salir del programa si es inválido
                }
            }
            case 2 -> {
                if (dia < 1 || dia > 28){
                    System.out.println("Fecha inválida");
                    return; // Salir del programa si es inválido
                }    
            }
            case 4, 6, 9, 11 -> {
                if (dia < 1 || dia > 30){
                    System.out.println("Fecha inválida");
                    return; // Salir del programa si es inválido
                }
            } 
        }
            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
    }
}
