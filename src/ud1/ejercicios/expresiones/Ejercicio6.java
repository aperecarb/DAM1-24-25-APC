package ejercicios.expresiones;

public class Ejercicio6 {
    public static void main(String[] args) {

        int a = 10, b = 20;
        int resultado = (a > b) ? a : b;
        /* operador ternario -> ?: if-else
            if (a > b)  
                true: resultado = a 
                false: resultado = b
        */

        /* int resultado;
            if (a > b) {
                resultado = a;
            } else {
                resultado = b;
            } 
        */
        
        System.out.println("Resultado: " + resultado);
    }
}
