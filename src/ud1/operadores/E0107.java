/* Aplicación que calcule el perímetro y el área de un círculo a partir del valor del radio introducido por teclado. El radio puede contener decimales. */

package operadores;
import java.util.Scanner;

public class E0107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = Math.PI;

        System.out.print("Introduzca el radio del circulo: ");
        float radio = scanner.nextFloat();

        double perimetro = 2*pi*radio;
        double area = pi * radio * radio;

        System.out.println("Perímetro:  " + perimetro);
        System.out.print("Área:  " + area);

        scanner.close();
    }
}
