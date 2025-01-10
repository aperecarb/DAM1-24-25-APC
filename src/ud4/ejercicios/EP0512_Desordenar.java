package ud4.ejercicios;

import java.util.Random;

public class EP0512_Desordenar {
    public static void desordenar(int[] t) {
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            int rand = rnd.nextInt(t.length);
            int val = t[i];
            t[i] = t[rand];
            t[rand] = val;
        }
    }

    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};

        System.out.println("Tabla: ");
        for (int num : tabla) {
            System.out.println(num + "");
        }
        
        System.out.println("Tabla desordenada: ");
        desordenar(tabla);
        for (int num : tabla) {
            System.out.println(num + " ");
        }
    }
}