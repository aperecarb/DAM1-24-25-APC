package ejercicios.expresiones.avanzados;

public class Ejercicio2 {
    public static void main(String[] args) {

        int a = 8, b = 3, c = 6;
        c -= a / b + 2 * (b++); 
        /* 8 / 3 + 2 * (3 + 1)
            2    + 8
                10  

        c = 8 - 10 = -2     */

        int resultado = c;
        System.out.println("Resultado: " + resultado);
    }
}
