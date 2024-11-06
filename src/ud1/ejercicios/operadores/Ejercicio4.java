package operadores;

public class Ejercicio4 {
    public static void main(String[] args) {

        double d = 3;
        double t = 2;
        double v = d/t;  

        if (t <= 0){
            System.out.println("El tiempo no puede ser negativo ni nulo.");
        }else{
            System.out.println("Velocidad: " + v);
        }
    }   
}
