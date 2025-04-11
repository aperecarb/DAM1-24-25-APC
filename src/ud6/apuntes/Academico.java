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

class Main {

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
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    Character letra = partes[0].charAt(0);
                    String nombre = partes[1].trim();
                    int anioIngreso = Integer.parseInt(partes[2].trim());
                    nuevoAcademico(academia, new Academico(nombre, anioIngreso), letra);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        List<Academico> academicosSinLetra = new ArrayList<>(academia.values());
        Collections.sort(academicosSinLetra);
        System.out.println("Listado 1: Académicos sin letra (ordenados por nombre y año)");
        for (Academico academico : academicosSinLetra) {
            System.out.println(academico);
        }

        List<Map.Entry<Character, Academico>> academicosConLetra = new ArrayList<>(academia.entrySet());
        academicosConLetra.sort(Map.Entry.comparingByKey());
        System.out.println("\nListado 2: Académicos con letra (ordenados por letra, nombre y año)");
        for (Map.Entry<Character, Academico> entrada : academicosConLetra) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}