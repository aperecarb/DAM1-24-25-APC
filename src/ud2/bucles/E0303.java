/* Codificar el juego “el número secreto”, que consiste en acertar un número entre 1
y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de
números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con
respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se
rinde (introduciendo un -1). 

Amplía el programa para que muestre el número secreto cuando el usuario se rinda y el 
número de intentos cuando haya acertado.*/

package bucles;
import java.util.Scanner;
import java.util.Random;

public class E0303 {
    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(100) + 1;
        int numero = 0;
        int contador = 0; 

        while (aleatorio != numero && numero != -1){
        System.out.printf("\nIntroduzca un número del %d al %d: ", MIN, MAX);
        numero = scanner.nextInt();

        contador++;

        if(aleatorio < numero){
            System.out.printf("\nEl número es menor que %d\n", numero);
        }else if(aleatorio > numero && numero != -1){
            System.out.printf("\nEl número es mayor que %d\n", numero);
        }
        }

        scanner.close();

        if(numero == aleatorio){
            System.out.println("\nHas adivinado el número !!");
            System.out.println("Número de intentos utilizados: " + contador);
        }else{
            System.out.println("Te has rendido\nEl número secreto era " + aleatorio);
        }
    }
}
