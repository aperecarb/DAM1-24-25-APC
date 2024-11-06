package operadores;

public class Ejercicio3 {
    public static void main(String[] args) {

        double x1 = 1;
        double x2 = 1;
        double y1 = 3;
        double y2 = 4;

        double resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distancia: " + resultado);
    }
    
}
