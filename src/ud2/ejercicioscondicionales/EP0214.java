/* Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa
debe mostrarlo con letras, por ejemplo, para 56, se verá "cincuenta y seis". */

package ejerciciosU2.propuestos.condicionales;

import java.util.Scanner;

public class EP0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entre 1 y 99: ");
        int numero = scanner.nextInt();
        String resultado;

        if (numero < 1 || numero > 99) {
            System.out.println("El número debe estar entre 1 y 99.");
        } else {
            if (numero < 10) {
                switch (numero) {
                    case 1: resultado = "uno"; break;
                    case 2: resultado = "dos"; break;
                    case 3: resultado = "tres"; break;
                    case 4: resultado = "cuatro"; break;
                    case 5: resultado = "cinco"; break;
                    case 6: resultado = "seis"; break;
                    case 7: resultado = "siete"; break;
                    case 8: resultado = "ocho"; break;
                    case 9: resultado = "nueve"; break;
                    default: resultado = ""; break;
                }
            } else if (numero < 20) {
                switch (numero) {
                    case 10: resultado = "diez"; break;
                    case 11: resultado = "once"; break;
                    case 12: resultado = "doce"; break;
                    case 13: resultado = "trece"; break;
                    case 14: resultado = "catorce"; break;
                    case 15: resultado = "quince"; break;
                    case 16: resultado = "dieciséis"; break;
                    case 17: resultado = "diecisiete"; break;
                    case 18: resultado = "dieciocho"; break;
                    case 19: resultado = "diecinueve"; break;
                    default: resultado = ""; break;
                }
            } else if (numero < 30) {
                if (numero == 20) {
                    resultado = "veinte";
                } else {
                    switch (numero % 10) {
                        case 1: resultado = "veintiuno"; break;
                        case 2: resultado = "veintidós"; break;
                        case 3: resultado = "veintitrés"; break;
                        case 4: resultado = "veinticuatro"; break;
                        case 5: resultado = "veinticinco"; break;
                        case 6: resultado = "veintiséis"; break;
                        case 7: resultado = "veintisiete"; break;
                        case 8: resultado = "veintiocho"; break;
                        case 9: resultado = "veintinueve"; break;
                        default: resultado = ""; break;
                    }
                }
                // y si explicas los arrays oscar
            } else {
                int decena = numero / 10;
                int unidad = numero % 10;

                switch (decena) {
                    case 3: resultado = "treinta"; break;
                    case 4: resultado = "cuarenta"; break;
                    case 5: resultado = "cincuenta"; break;
                    case 6: resultado = "sesenta"; break;
                    case 7: resultado = "setenta"; break;
                    case 8: resultado = "ochenta"; break;
                    case 9: resultado = "noventa"; break;
                    default: resultado = ""; break;
                }

                if (unidad != 0) {
                    resultado += " y ";
                    switch (unidad) {
                        case 1: resultado += "uno"; break;
                        case 2: resultado += "dos"; break;
                        case 3: resultado += "tres"; break;
                        case 4: resultado += "cuatro"; break;
                        case 5: resultado += "cinco"; break;
                        case 6: resultado += "seis"; break;
                        case 7: resultado += "siete"; break;
                        case 8: resultado += "ocho"; break;
                        case 9: resultado += "nueve"; break;
                        default: resultado += ""; break;
                    }
                }
            }
            System.out.println("El número en letras es: " + resultado);
        }

        scanner.close();
    }
}
