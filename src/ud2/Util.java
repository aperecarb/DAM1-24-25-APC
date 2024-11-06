import java.util.Scanner;

public class Util {
    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int n = sc.nextInt();
    }
}
