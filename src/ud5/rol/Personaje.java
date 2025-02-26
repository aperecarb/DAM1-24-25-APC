package ud5.rol;

import org.json.JSONObject;
import java.util.Random;

public class Personaje {
    public String nombre;
    public String raza;
    public int fuerza, agilidad, constitucion;
    public int nivel;
    public int experiencia;
    public int puntosVida;

    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion) throws Exception {
        if (!esRazaValida(raza) || fuerza < 1 || agilidad < 1 || constitucion < 1) {
            throw new Exception("El personaje no es válido");
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

    public byte sumarExperiencia(int puntos) {
        experiencia += puntos;
        byte nivelesSubidos = 0;
        while (experiencia >= (nivel * 1000)) {
            subirNivel();
            nivelesSubidos++;
        }
        return nivelesSubidos;
    }

    public void subirNivel() {
        nivel++;
        fuerza *= 1.05;
        agilidad *= 1.05;
        constitucion *= 1.05;
        System.out.println(nombre + " ha subido a nivel " + nivel);
    }

    public void curar() {
        int vidaMaxima = 50 + constitucion;
        if (puntosVida < vidaMaxima) {
            puntosVida = vidaMaxima;
        }
    }

    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return puntosVida <= 0;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public int atacar(Personaje enemigo) {
        Random rand = new Random();
        int ataque = fuerza + rand.nextInt(100) + 1;
        int defensa = enemigo.agilidad + rand.nextInt(100) + 1;
        int daño = Math.max(0, ataque - defensa);
        daño = Math.min(daño, enemigo.puntosVida);
        if (daño > 0) {
            enemigo.perderVida(daño);
            sumarExperiencia(daño);
            enemigo.sumarExperiencia(daño);
        }
        return daño;
    }

    private boolean esRazaValida(String raza) {
        return raza.equals("HUMANO") || raza.equals("ELFO") || raza.equals("ENANO") || raza.equals("HOBBIT")
                || raza.equals("ORCO") || raza.equals("TROLL");
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int atacar(Monstruo enemigo) {
        Random rand = new Random();
        int ataqueTotal = fuerza + rand.nextInt(100) + 1;
        int defensaTotal = enemigo.defensa + rand.nextInt(100) + 1;
        int daño = Math.max(0, ataqueTotal - defensaTotal);
        daño = Math.min(daño, enemigo.puntosVida);
        if (daño > 0) {
            enemigo.perderVida(daño);
            sumarExperiencia(daño);
        }
        return daño;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("nombre", nombre);
        json.put("raza", raza);
        json.put("fuerza", fuerza);
        json.put("agilidad", agilidad);
        json.put("constitucion", constitucion);
        json.put("nivel", nivel);
        json.put("experiencia", experiencia);
        json.put("puntosVida", puntosVida);
        return json;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza + ", Agilidad: " + agilidad + ", Constitución: " + constitucion);
        System.out.println("Nivel: " + nivel + ", Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosVida);
    }
}
