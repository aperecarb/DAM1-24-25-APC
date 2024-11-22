package bucles;

import java.util.*;

public class EP0305 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int respuesta = 1;
        int numero3 = 0;
        int numero1;
        int numero2;
        int aciertos = 0;

        System.out.println("Veamos que tal calcula.");

        do {
            numero1 = random.nextInt(100);
            numero2 = random.nextInt(100);

            numero3 = numero1 + numero2;

            System.out.printf("Sume %d + %d e introduzca el resultado.%n", numero1, numero2);
            respuesta = scanner.nextInt();
            if (respuesta == (numero1 + numero2)) {
                System.out.printf("Muy bien. %d + %d = %d; aquí tiene otro. %n%n", respuesta, numero1, numero2,
                        numero3);
                aciertos++;
            }
        } while (numero3 == respuesta);

        System.out.printf("Se ha equivocado. La respuesta correcta era %d.%n%n", numero1, numero2, numero3, respuesta);
        System.out.printf("Ha acertado un total de %d veces. Enhorabuena. %n%n", aciertos);

        scanner.close();
    }

}
