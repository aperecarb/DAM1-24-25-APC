/* Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. 
Para ello introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos 
cuando se utilice el -1 como altura). Los árboles se identifican mediante etiquetas con números únicos consecutivos, 
comenzando en 0. Diseñar una aplicación que, al terminar la introducción de datos, muestre el número y la altura 
del árbol más alto. */

package ejerciciosU2.bucles;
import java.util.Scanner;

public class E0304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int contadorAlto = 0;
        int arbol = 0;
        int arbolAlto = 0;

        while(arbol != -1){
            System.out.println("\nIntroduzca la altura del árbol: ");
            arbol = scanner.nextInt();
            contador++;

            if(arbol > arbolAlto){
                arbolAlto = arbol;
                contadorAlto = contador; 
            }
        }
        scanner.close();

        System.out.println("\nID árbol más alto: " + contadorAlto);
        System.out.println("Altura árbol más alto: " + arbolAlto);
    }
}
