
package ud2.bucles;

import java.util.Scanner;

public class EP0311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número decimal: ");
        int decimal = scanner.nextInt();

        if (decimal == 0) {
            System.out.println("0");
        } else {
            StringBuilder binario = new StringBuilder();
            while (decimal > 0) {
                binario.append(decimal % 2);
                decimal /= 2;
            }
            binario.reverse();
            for (int i = 0; i < binario.length(); i++) {
                System.out.println(binario.charAt(i));
            }
        }
        scanner.close();
    }
}
