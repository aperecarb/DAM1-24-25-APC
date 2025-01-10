package ud4.apuntes;

import java.util.Random;

public class Ejemplos02 {
    public static void main(String[] args) {
        final int NUM = 1000;
        int[] edad;
        Random rnd = new Random();

        edad = new int[NUM];

        for (int i = 0; i < NUM; i++) {
            edad[i] = rnd.nextInt(18, 41);
        }

        long suma = 0;
        for (int i = 0; i < NUM; i++) {
            suma += edad[i];
        }

        double media = suma /  NUM;

        System.out.println("La edad de la persona 2 es " + edad[2]);
        System.out.println("La suma de las edades es: " + suma);
        System.out.println("La media de edad de " + NUM + " edades es: " + media);

        System.out.println("Fin de programa.");
    }
}
