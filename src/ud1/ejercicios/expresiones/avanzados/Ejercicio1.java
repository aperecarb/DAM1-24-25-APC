package ejercicios.expresiones.avanzados;

public class Ejercicio1 {
    public static void main(String[] args) {

        int resultado = 12 / 4 + 3 * (2 + 1) - 5 % 2;
        /*              3      + 3 * 3       - 1  
                        3      + 9           - 1
                        12 - 1
                        11
        */

        System.out.println("Resultado: " + resultado);
    }
}
