/* Usa la clase LocalDate para obtener el año actual */

package operadores;
import java.util.Scanner;
import java.time.LocalDateTime; 

public class E0104b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        LocalDateTime now = LocalDateTime.now();
        int añoactual = now.getYear();

        System.out.print("Introduzca su año de nacimiento: ");
        int añonacimiento = scanner.nextInt();

        int edad = añoactual-añonacimiento;

        System.out.printf("Tienes %d años.", edad);

        scanner.close();

    }
}