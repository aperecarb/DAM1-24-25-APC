package ud6.apuntes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Academico implements Comparable<Academico> {
    String nombre;
    int anioIngreso;

    public Academico(String nombre, int anioIngreso) {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public int compareTo(Academico otro) {
        int resultado = this.nombre.compareTo(otro.nombre);
        if (resultado == 0) {
            return Integer.compare(this.anioIngreso, otro.anioIngreso);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return nombre + " (" + anioIngreso + ")";
    }
}

public class Main {

    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("academicos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length >= 4) { // Aseguramos que haya al menos 4 partes
                    Character letra = partes[0].charAt(5); // La letra está en el sexto carácter
                    int anioIngreso = Integer.parseInt(partes[partes.length - 1].replaceAll("[()]", "")); // El año está al final, eliminamos paréntesis
                    String nombre = "";
                    for (int i = 1; i < partes.length - 1; i++) { // Construimos el nombre
                        nombre += partes[i] + " ";
                    }
                    nombre = nombre.trim(); // Eliminamos espacios extra al final
                    nuevoAcademico(academia, new Academico(nombre, anioIngreso), letra);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return; // Salir si hay un error al leer el archivo
        }

        // Listado 1: Académicos sin letra, ordenados por nombre y año
        List<Academico> academicosSinLetra = new ArrayList<>(academia.values());
        Collections.sort(academicosSinLetra);
        System.out.println("Listado 1: Académicos sin letra (ordenados por nombre y año)");
        for (Academico academico : academicosSinLetra) {
            System.out.println(academico);
        }

        // Listado 2: Académicos con letra, ordenados por letra, nombre y año
        List<Map.Entry<Character, Academico>> academicosConLetra = new ArrayList<>(academia.entrySet());
        academicosConLetra.sort(Map.Entry.comparingByKey());
        System.out.println("\nListado 2: Académicos con letra (ordenados por letra, nombre y año)");
        for (Map.Entry<Character, Academico> entrada : academicosConLetra) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
