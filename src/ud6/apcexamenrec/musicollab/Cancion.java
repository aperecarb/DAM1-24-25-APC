/* Álvaro Pereira Carballo */

package ud6.apcexamenrec.musicollab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cancion implements Comparable<Cancion> {
        public String nombre;
        public String autor;
        public String estiloMusical;
        public List<String> instrumentosRequeridos;

        // Creamos el constructor de la cancion
        public Cancion(String nombre, String autor, String estiloMusical, List<String> instrumentosRequeridos) {
                this.nombre = nombre;
                this.autor = autor;
                this.estiloMusical = estiloMusical;
                this.instrumentosRequeridos = new ArrayList<>(new HashSet<>(instrumentosRequeridos));
        }

        // Creamos los getters y listas
        public String getNombre() {
                return nombre;
        }

        public String getAutor() {
                return autor;
        }

        public String getEstiloMusical() {
                return estiloMusical;
        }

        public List<String> getInstrumentosRequeridos() {
                return instrumentosRequeridos;
        }

        // Creamos el método instrumentosDistintos
        public static List<String> instrumentosDistintos(Collection<Cancion> canciones) {
                Set<String> instrumentos = new TreeSet<>();
                for (Cancion c : canciones) {
                        instrumentos.addAll(c.getInstrumentosRequeridos());
                }
                return new ArrayList<>(instrumentos);
        }

        // Cambiamos compareTo y toString
        @Override
        public int compareTo(Cancion otra) {
                return this.nombre.compareToIgnoreCase(otra.nombre);
        }

        @Override
        public String toString() {
                return "\"" + nombre + "\"" + " (" + autor + ") - [" + estiloMusical + "] | Instrumentos: " + instrumentosRequeridos;
        }

        public static void main(String[] args) {
                // Canciones de ejemplo
                List<Cancion> canciones = Arrays.asList(
                                new Cancion("Bohemian Rhapsody", "Queen", "Rock",
                                                List.of("voz", "piano", "guitarra", "batería")),
                                new Cancion("Billie Jean", "Michael Jackson", "Pop",
                                                List.of("voz", "bajo", "batería")),
                                new Cancion("Imagine", "John Lennon", "Balada",
                                                List.of("voz", "piano")),
                                new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Yesterday", "The Beatles", "Pop",
                                                List.of("voz", "guitarra")),
                                new Cancion("Sweet Child O'Mine", "Guns N' Roses", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")),
                                new Cancion("Rolling in the Deep", "Adele", "Pop",
                                                List.of("voz", "piano", "batería")),
                                new Cancion("Hotel California", "Eagles", "Rock",
                                                List.of("voz", "guitarra", "bajo", "batería")));

                // Ordenar canciones por nombre
                Collections.sort(canciones);
                System.out.println("\nCanciones ordenadas por nombre:");
                System.out.println("===============================\n");
                canciones.forEach(System.out::println);

                // Ordenar canciones alfabéticamente por estilo musical, luego por autor y luego
                // por nombre
                System.out.println("\nCanciones ordenadas por estilo musical, luego por autor y luego por nombre:");
                System.out.println("===========================================================================\n");

                Collections.sort(canciones, Comparator.comparing(Cancion::getEstiloMusical));

                canciones.forEach(System.out::println);

                // Obtener lista de instrumentos distintos
                System.out.println("\nLista de instrumentos distintos:");
                System.out.println("================================\n");
                System.out.println(instrumentosDistintos(canciones));

                System.out.println("\n");
        }

}
