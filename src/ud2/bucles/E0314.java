/* Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10 */

package bucles;
public class E0314 {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            System.out.println("\nTabla del " + i);

            for(int j = 1; j < 11; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
