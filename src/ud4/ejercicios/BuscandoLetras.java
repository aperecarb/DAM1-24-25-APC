package ud4.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscandoLetras {
    static int[] buscarLetra(String cadena, char letra) {
        ArrayList<Integer> posis = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                posis.add(i);
            }
        }

        int[] resultado = new int[posis.size()];
        for (int i = 0; i < posis.size(); i++) {
            resultado[i] = posis.get(i);
        }
        return resultado;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();

        System.out.println("Cadena: " + cadena); 

        while (true) { 
            System.out.print("Introduce una letra (no presente para salir): "); 
            char letra = sc.next().charAt(0);

            int[] posis = buscarLetra(cadena, letra); 

            if (posis.length == 0) { 
                System.out.println("La letra " + letra + " no se encuentra en la cadena."); 
                break;
            } 

            System.out.print("La letra '" + letra + "' aparece en las posiciones: "); 
            for (int pos : posis) { 
                System.out.print(pos + " "); 
            } 
            System.out.println("\nApariciones: " + posis.length); 
        }
        sc.close(); 
    }
}