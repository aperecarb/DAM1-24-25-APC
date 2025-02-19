package ud5.rol;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

public class Personaje {
    private String nombre;
    private String raza;
    private int fuerza, agilidad, constitucion;
    private int nivel;
    private int experiencia;
    private int puntosVida;

    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion) throws Exception {
        if (!esRazaValida(raza) || fuerza < 1 || agilidad < 1 || constitucion < 1) {
            throw new Exception("Personaje no válido");
        }
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50 + constitucion;
    }

    public Personaje(String nombre, String raza) throws Exception {
        this(nombre, raza, getRandomValue(), getRandomValue(), getRandomValue());
    }

    public Personaje(String nombre) throws Exception {
        this(nombre, "HUMANO");
    }

    private static int getRandomValue() {
        return new Random().nextInt(100) + 1;
    }

    private boolean esRazaValida(String raza) {
        return raza.equals("HUMANO") || raza.equals("ELFO") || raza.equals("ENANO") || raza.equals("HOBBIT") || raza.equals("ORCO") || raza.equals("TROLL");
    }

    public void guardarEnJSON() {
        JSONObject json = new JSONObject();
        json.put("nombre", nombre);
        json.put("raza", raza);
        json.put("fuerza", fuerza);
        json.put("agilidad", agilidad);
        json.put("constitucion", constitucion);
        json.put("nivel", nivel);
        json.put("experiencia", experiencia);
        json.put("puntosVida", puntosVida);

        try (FileWriter file = new FileWriter(nombre + ".json")) {
            file.write(json.toString(4));
        } catch (IOException e) {
            System.out.println("Error guardando el personaje en JSON: " + e.getMessage());
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza + ", Agilidad: " + agilidad + ", Constitución: " + constitucion);
        System.out.println("Nivel: " + nivel + ", Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosVida);
    }
}
