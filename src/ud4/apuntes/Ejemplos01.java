package ud4.apuntes;

public class Ejemplos01 {
    public static void main(String[] args) {
        int[] edad;

        edad = new int[5]; // Del 0 al 4

        edad[0] = 28;
        edad[1] = 35;
        edad[2] = 18;
        edad[5] = 20; // Esta variable nos dará una excepción

        System.out.println("La edad de la persona 2 es " + edad[2]);

        System.out.println("Fin de programa.");
    }
}
