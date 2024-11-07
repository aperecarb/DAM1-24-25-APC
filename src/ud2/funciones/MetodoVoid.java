package funciones;

import java.util.Scanner;

public class MetodoVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();

        cajaTexto(cadena);

        sc.close();
    }

    public static void cajaTexto(String str) {
        int n = str.length();

        imprimirLinea(n);
        System.out.println("#" + str + "#");
        imprimirLinea(n);
    }

    public static void imprimirLinea(int n) {
        for (int i = 1; i <= n + 4; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
