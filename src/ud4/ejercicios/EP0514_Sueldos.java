package ud4.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> sueldos = new ArrayList<>();

        System.out.println("Introduce los sueldos individualmente y termina de introducirlos escribiendo -1:");

        while (true) {
            double sueldo = sc.nextDouble();
            if (sueldo == -1) {
                break;
            }
            sueldos.add(sueldo);
        }

        if (sueldos.isEmpty()) {
            System.out.println("No se ha introducido ningún sueldo.");
        } else {
            sueldos.sort(Collections.reverseOrder());

            double maximo = Collections.max(sueldos);
            double minimo = Collections.min(sueldos);

            double suma = 0;

            for (double sueldo : sueldos) {
                suma += sueldo;
            }

            double promedio = suma / sueldos.size();
            
            System.out.println("Sueldos descendentemente ordenados: " + sueldos);
            System.out.printf("Sueldo máximo: %.2f euros.%n", maximo);
            System.out.printf("Sueldo mínimo: %.2f euros.%n", minimo);
            System.out.printf("Sueldo medio: %.2f euros.", promedio);
        }
        sc.close();
    }
}