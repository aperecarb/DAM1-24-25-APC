package identificadores;

public class Identificadores {
    public static void main(String[] args) {

        final int NUMERO_ALUMNOS = 33;


        String numeroDeTelefono = "986640123";
    double totalVentas = 576.55;
    byte edad;
    edad = 19;
    float monedero = 58.23F;

    boolean estaLloviendo;

    String miNombre = "Rocío";

    char letraPreferida = 'Ç';

System.out.print("Número de Teléfono: ");
System.out.println(numeroDeTelefono);

System.out.println("Total ventas: " + totalVentas);

System.out.println("Me llamo " + miNombre);

estaLloviendo = true;
System.out.println("¿Está lloviendo? " + estaLloviendo);

System.out.println("Mi letra preferida es la " + letraPreferida);

long numEnorme = 234324523;
edad = (byte)(edad + 1);
System.out.println("Mi edad es " + edad);
System.out.println(NUMERO_ALUMNOS);
System.out.println(numEnorme);

System.out.println(String.format("Tengo %.2f en el monedero ", monedero));
    }
} 