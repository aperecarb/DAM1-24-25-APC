package ud4.ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elección;

        System.out.println("Bienvenid@ a la calculadora. Introduzca el número a continuación en función de lo que desee hacer:\n 0. Sumar.\n 1. Restar.\n 2. Multiplicar.\n 3. Dividir.");
        elección = sc.nextInt();

        switch (elección) {
            case -1:
                break;
            case 0:
                
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Debes introducir una opción válida.");
                break;
        }
    }
}