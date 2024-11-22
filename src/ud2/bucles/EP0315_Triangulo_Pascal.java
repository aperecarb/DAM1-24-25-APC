package bucles;

import java.util.Scanner;

public class EP0315_Triangulo_Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el número de filas: ");
        int filas = scanner.nextInt();
        
        for(int i = 0; i < filas; i++){
            for (int j = 0; j < i; j++){
                
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
