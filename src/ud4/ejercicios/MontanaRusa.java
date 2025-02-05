package ud4.ejercicios;

public class MontanaRusa {
    public static int contarPicos(int[] alturas) {
        int picos = 0;
        int n = alturas.length;

        for (int i = 0; i < n; i++) {
            int anterior = alturas[(i - 1 + n) % n];
            int actual = alturas[i];
            int siguiente = alturas[(i + 1) % n];

            if (actual > anterior && actual > siguiente) {
                picos++;
            }
        }
        return picos;
    }

    public static void main(String[] args) {
        int[] alturas1 = {4, 10, 3, 2};
        System.out.println(contarPicos(alturas1)); // 1 pico

        int[] alturas2 = {10, 3};
        System.out.println(contarPicos(alturas2)); // 1 pico

        int[] alturas3 = {4, 10, 3, 2, 10};
        System.out.println(contarPicos(alturas3)); // 2 picos

        int[] alturas4 = {4, 4};
        System.out.println(contarPicos(alturas4)); // 0 picos
    }
}
