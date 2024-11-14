package excepciones;

public class DivisionPorCero {
    public static void main(String[] args) {
        int a = 4, b = 1;
        try {
            System.out.println(a/b);
            System.out.println("División exitosa.");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: ¿División por cero?");
            System.out.println(e.toString());
        }
    }
}
