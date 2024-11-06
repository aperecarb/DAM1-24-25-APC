/* Escribir todos los múltiplos de 7 menores que 100. */

package ejerciciosU2.bucles;

public class E0307 {
    public static void main(String[] args) {

        System.out.println("Vamos a escribir todos los múltiplos de 7 menores que 100");

        for(int i = 1; i < 100; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
