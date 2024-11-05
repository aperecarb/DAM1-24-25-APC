/* Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario */

import java.util.Scanner;

public class EP0128 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un valor para a: ");
        int a = scanner.nextInt();
        System.out.print("Introduzca un valor para b: ");
        int b = scanner.nextInt();

        scanner.close();

        String comprobacion = (a == b) ? "true" :
                                         "false";

        System.out.println("La afirmación de que los números sean iguales es " + comprobacion);
    }
}
