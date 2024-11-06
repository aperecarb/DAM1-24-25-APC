/* Diseñar un programa que muestre la suma de los 10 primeros números impares. */

package bucles;

public class E0310 {
    public static void main(String[] args) {
        final int NSUMA = 10;
        int suma = 0;
        int numero = 0;
        int nImpares = 0;

        do{
            numero++;
            if (numero % 2 != 0){
                suma = suma + numero;
                nImpares++;
            }

        }while(nImpares < NSUMA);

        System.out.printf("La suma de los %d primeros números impares es %d", NSUMA, suma);
    }
}
