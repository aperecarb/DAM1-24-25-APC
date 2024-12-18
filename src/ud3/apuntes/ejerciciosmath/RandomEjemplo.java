package ud3.apuntes.ejerciciosmath;

import java.util.Random;

public class RandomEjemplo {
    public static void main(String[] args) {
        final int MIN = 100;
        final int MAX = 200;

        Random rndRandom = new Random();

        System.out.println(rndRandom.nextInt());
        System.out.println(rndRandom.nextInt(MAX));
        System.out.println(rndRandom.nextInt(MIN, MAX));

        System.out.println(rndRandom.nextDouble());
        System.out.println(rndRandom.nextDouble(MAX));
        System.out.println(rndRandom.nextDouble(MIN, MAX));

        System.out.println(rndRandom.nextBoolean());
    }
}
