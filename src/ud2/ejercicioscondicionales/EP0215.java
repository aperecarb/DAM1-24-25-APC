/* Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un 
triángulo. Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son negativos, algo 
que no tendría sentido. */

package ejerciciosU2.propuestos.condicionales;
import java.util.Scanner;

public class EP0215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;

        do{
        System.out.print("Introduzca la base del triángulo: ");
        base = scanner.nextDouble();
        }while(base < 0);
        do{
        System.out.print("\nIntroduzca la altura del triángulo: ");
        altura = scanner.nextDouble();
        }while(altura < 0);

        scanner.close();

        double area = base * altura / 2;

        System.out.printf("Área del triángulo: %.2f", area);
    }
}
