/* Dado el siguiente polinomio de segundo grado:
    y = ax^2 + bx + c
crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
correspondiente de y. */

import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce los coeficientes a, b y c separados por espacios: "); 
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        System.out.print("Introduce el valor de la variable x: "); 
        float x = scanner.nextFloat();

        float y = a * x * x + b * x * c;

        System.out.print("El valor de y es: "+ y);

        scanner.close();
    }
}
