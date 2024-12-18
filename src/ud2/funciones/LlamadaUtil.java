package ud2.funciones;

import java.util.Scanner;
import ud2.util.Util;

public class LlamadaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número / Año: ");
        int n = sc.nextInt();

        if (Util.esPar(n)) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }

        sc.close();
    }
}