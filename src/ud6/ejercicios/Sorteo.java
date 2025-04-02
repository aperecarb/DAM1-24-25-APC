package ud6.ejercicios;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import ud5.rol.Personaje;

public class Sorteo<T> {
    public Set<T> valoresPosibles;
    public Random rnd;

    public Sorteo() {
        this.valoresPosibles = new HashSet<>();
        this.rnd = new Random();
    }

    public boolean add(T e) {
        return valoresPosibles.add(e);
    }

    public Set<T> premiados(int num) {
        if (num > valoresPosibles.size()) {
            throw new IllegalArgumentException("No puede haber más premiados que valores posibles.");
        }

        Set<T> premiados = new HashSet<>();
        Object[] valores = valoresPosibles.toArray();

        while (premiados.size() < num) {
            int indice = rnd.nextInt(valores.length);
            premiados.add((T) valores[indice]);
        }
        return premiados;
    }

    public static void main(String[] args) {
        // Crea un sorteo entre 4 personajes para seleccionar los 2 que se enfrentarán en combate singular
        Sorteo<Personaje> sorteo = new Sorteo<>();
        sorteo.add(new Personaje("Aragorn", Raza.HUMANO, 90, 90, 90, 10, 16252, 125));
        sorteo.add(new Personaje("Mara", Raza.ELFO, 100, 100, 100));
        sorteo.add(new Personaje("Dodol Bazbal", Raza.ENANO));
        sorteo.add(new Personaje("Lady Jet"));

        Set<Personaje> elegidos = sorteo.premiados(2);

        System.out.println(elegidos);
    }
}
