package ud6.apuntes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E1204 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros no negativos (-1 para terminar):");
        int numero = scanner.nextInt();
        while (numero != -1) {
            numeros.add(numero);
            numero = scanner.nextInt();
        }

        System.out.println("Colección: " + numeros);

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Colección sin múltiplos de 3: " + numeros);
        scanner.close();
    }
}
