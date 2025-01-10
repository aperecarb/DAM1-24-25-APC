package ud4.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sueldos = new ArrayList<>();

        System.out.println("Introduce los sueldos individualmente y termina de introducirlos escribiendo -1:");

        while (true) {
            int sueldo = scanner.nextInt();
            if (sueldo == -1) {
                break;
            }
            sueldos.add(sueldo);
        }

        if (sueldos.isEmpty()) {
            System.out.println("No se ha introducido ningún sueldo.");
        } else {
            sueldos.sort(Collections.reverseOrder());

            int maximo = Collections.max(sueldos);
            int minimo = Collections.min(sueldos);

            double suma = 0;

            for (int sueldo : sueldos) {
                suma += sueldo;
            }

            double promedio = suma / sueldos.size();
            
            System.out.println("Sueldos descendentemente ordenados: " + sueldos);
            System.out.println("Sueldo máximo: " + maximo);
            System.out.println("Sueldo mínimo: " + minimo);
            System.out.printf("Sueldo medio: %.2f%n", promedio);

            scanner.close();
        }
    }
}