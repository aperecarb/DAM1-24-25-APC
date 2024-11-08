package util;

import java.util.Scanner;

public class Util {
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esBisiesto(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean esCasiCero(double num) {
        return (num != 0 && num > -1 && num < 1);
    }

    public static String notaEnTexto(int nota) {
        String notaEnTexto = "";

        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "Insuficiente";
                break;
            case 5:
                notaEnTexto = "Suficiente";
                break;
            case 6:
                notaEnTexto = "Bien";
                break;
            case 7, 8:
                notaEnTexto = "Notable";
                break;
            case 9, 10:
                notaEnTexto = "Sobresaliente";
                break;
            default:
                break;
        }

        return notaEnTexto;
    }

    public static String notaEnTexto(double nota) {
        String notaEnTexto = "";

        if (nota < 0 || nota > 10) {
            notaEnTexto = "Nota inválida";
        }

        if (nota > 0 && nota < 5) {
            notaEnTexto = "Insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    public static void imprimirTrianguloRectangulo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void imprimirTrianguloRectanguloInverso(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaDouble = 5.5;
        System.out.println(notaEnTexto(notaDouble));
        int notaInt = 8;
        System.out.println(notaEnTexto(notaInt));

        sc.close();
    }
}