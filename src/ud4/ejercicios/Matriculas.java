package ud4.ejercicios;

import java.util.Scanner;

public class Matriculas {
    public static boolean esMatriculaValida(String matricula) {
        if (matricula.length() != 7) {
            return false;
        }

        String numeros = matricula.substring(0, 4);
        String letras = matricula.substring(4).toUpperCase();

        for (char c : numeros.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        for (char c : letras.toCharArray()) {
            if (!esLetraValida(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean esLetraValida(char c) {
        return c >= 'B' && c <= 'Z' && "AEIOUÑNQ".indexOf(c) == -1;
    }

    public static String siguienteMatricula(String matricula) {
        if (!esMatriculaValida(matricula)) {
            return "Matrícula inválida";
        }

        String numeros = matricula.substring(0, 4);
        String letras = matricula.substring(4).toUpperCase();

        String nuevosNumeros = incrementarDigitos(numeros);

        if (nuevosNumeros.equals("0000")) {
            letras = incrementarLetras(letras);
        }
        return nuevosNumeros + letras;
    }

    private static String incrementarDigitos(String numeros) {
        int num = Integer.parseInt(numeros);
        num = (num + 1) % 10000;
        return String.format("%04d", num);
    }

    private static String incrementarLetras(String letras) {
        char[] chars = letras.toCharArray();

        for (int i = 2; i >= 0; i--) {
            chars[i] = siguienteLetra(chars[i]);
            if (chars[i] != 'B') {
                break;
            }
        }
        return new String(chars);
    }

    private static char siguienteLetra(char c) {
        do {
            c++;
            if (c > 'Z') {
                return 'B';
            }
        } while (!esLetraValida(c));
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una matrícula: ");
        String matricula = sc.nextLine().toUpperCase();

        System.out.println("Matrícula válida: " + esMatriculaValida(matricula));

        if (esMatriculaValida(matricula)) {
            System.out.println("Siguiente matrícula: " + siguienteMatricula(matricula));
        } else {
            System.out.println("La matrícula es inválida.");
        }
        sc.close();
    }
}