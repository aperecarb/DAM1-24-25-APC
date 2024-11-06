/* Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes. 
Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango. 
Nota: El operador módulo (%) puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0 a 360°. */

package ejerciciosU2.propuestos.condicionales;

import java.util.Scanner;

public class EP0219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double PI = Math.PI;

        System.out.print("Introduzca los grados que tiene el ángulo: ");
        double grados = scanner.nextDouble();
        scanner.close();

        while(grados > 360){
            grados = grados % 360;
        }

        double radianes = grados * PI / 180;

        System.out.printf("%.2f grados son %.2f radianes", grados, radianes);
    }
}
