/*  Escribe un programa que reciba un número de mes (1 a 12) e imprima cuántos días tiene ese mes. */

package extra;
import java.util.Scanner;

public class MesAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número del 1 al 12: ");
        int mes = scanner.nextInt();

        switch (mes){ 
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Este mes tiene 31 días");
                break;
            case 4, 6, 9, 11:
                System.out.println("Este mes tiene 30 días");
                break;
            case 2:
                System.out.print("Ingrese el año: ");
                int año = scanner.nextInt();

                if (año % 4 == 0 && año % 100 != 0 && año % 400 != 0){
                    System.out.println("Este mes tiene 28 días");
                }else {
                    System.out.println("Este mes tiene 29 días");
                }
                break;
            default:
                System.out.println("Mes introducido no válido");
        }
        scanner.close();
    }
}
