package ud5.rol;

import java.util.Scanner;

public class AppCreaPersonaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese nombre del personaje: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese raza (HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL): ");
            String raza = sc.nextLine().toUpperCase();

            System.out.print("Ingrese fuerza: ");
            int fuerza = sc.nextInt();
            System.out.print("Ingrese agilidad: ");
            int agilidad = sc.nextInt();
            System.out.print("Ingrese constitución: ");
            int constitucion = sc.nextInt();

            Personaje personaje = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
            personaje.mostrar();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}