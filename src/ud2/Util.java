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

        if (esPar(n)) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }

        if (esBisiesto(n)) {
            System.out.println("Es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }

        System.out.println(mayor (4, 17));
        System.out.println(mayor (18, 4));

        sc.close();
    }
}
