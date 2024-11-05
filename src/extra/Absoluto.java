package extra;
import java.util.Scanner;

public class Absoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduzca un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int absoluto = numero > 0 ? numero : - numero;
        
        System.out.println(absoluto);
    }
}