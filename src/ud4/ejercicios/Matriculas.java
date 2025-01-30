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

<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una matrícula: ");
        String matricula = sc.nextLine().toUpperCase();

        System.out.println("Matrícula válida: " + esMatriculaValida(matricula));

        if (esMatriculaValida(matricula)) {
            System.out.println("Siguiente matrícula: " + siguienteMatricula(matricula));
        } else {
            System.out.println("La matrícula es inválida.");
=======
public static int comparaMatriculas(String m1, String m2) {
        if (!esMatriculaValida(m1) || !esMatriculaValida(m2)) {
            throw new IllegalArgumentException("Una o ambas matrículas no son válidas.");
>>>>>>> b086a978df77a337746022fe6a517586be97013d
        }

        int numeros1 = Integer.parseInt(m1.substring(0, 4));
        int numeros2 = Integer.parseInt(m2.substring(0, 4));

        if (numeros1 < numeros2) return -1;
        if (numeros1 > numeros2) return 1;

        String letras1 = m1.substring(4);
        String letras2 = m2.substring(4);

        return letras1.compareTo(letras2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera matrícula: ");
        String matricula1 = scanner.nextLine().toUpperCase();

        System.out.print("Introduce la segunda matrícula: ");
        String matricula2 = scanner.nextLine().toUpperCase();

        System.out.println("Matrícula 1 válida: " + esMatriculaValida(matricula1));
        System.out.println("Matrícula 2 válida: " + esMatriculaValida(matricula2));

        if (esMatriculaValida(matricula1) && esMatriculaValida(matricula2)) {
            int comparacion = comparaMatriculas(matricula1, matricula2);
            if (comparacion == 0) {
                System.out.println("Las matrículas son iguales.");
            } else if (comparacion < 0) {
                System.out.println("La matrícula " + matricula1 + " es más antigua que " + matricula2);
            } else {
                System.out.println("La matrícula " + matricula2 + " es más antigua que " + matricula1);
            }
        } else {
            System.out.println("No se puede comparar porque una o ambas matrículas no son válidas.");
        }

        scanner.close();
    }
}