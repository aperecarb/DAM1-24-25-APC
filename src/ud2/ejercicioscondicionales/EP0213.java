/* En una granja se compra diariamente una cantidad (comidaDiaria) de comida de alimento suficiente para cada amimal.
El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada animal come una 
media de kilosPorAnimal.

Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para
cada animal. En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero. */

package ejercicioscondicionales;

import java.util.Scanner;

public class EP0213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la cantidad diaria de comida que se compra: ");
        double comidaDiaria = scanner.nextDouble();

        int numAnimales; 

        // Repetir hasta que se introduzca un número de animales mayor que 0 para evitar posibles divisiones
        do{
        System.out.print("Introduzca la cantidad de animales que alimentar: ");
        numAnimales = scanner.nextInt();
        }while(numAnimales == 0);

        System.out.println("Introduzca la media de kilos que come un animal: ");
        double kilosPorAnimal = scanner.nextDouble();

        scanner.close();

        if (numAnimales * kilosPorAnimal <= comidaDiaria){
            System.out.println("Disponemos de alimento suficiente para cada animal");
        }else{
            System.out.println("No se dispone de alimento suficiente para cada animal");
            double kilosAdaptado = comidaDiaria / numAnimales;
            System.out.printf("La ración para cada animal adaptada a la comida sería de %.2f kilogramos por cabeza", kilosAdaptado);
        }
    }
}
