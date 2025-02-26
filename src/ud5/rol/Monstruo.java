package ud5.rol;

import java.util.Random;

public class Monstruo {
    protected String nombre;
    protected int ataque, defensa, velocidad, puntosVida;

    public Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return puntosVida <= 0;
    }

    public int atacar(Personaje personaje) {
        Random rand = new Random();
        int ataqueTotal = ataque + rand.nextInt(100) + 1;
        int defensaTotal = personaje.getAgilidad() + rand.nextInt(100) + 1;
        int daño = Math.max(0, ataqueTotal - defensaTotal);
        daño = Math.min(daño, personaje.getPuntosVida());
        if (daño > 0) {
            personaje.perderVida(daño);
        }
        return daño;
    }

    public String toString() {
        return (nombre != null ? nombre + "-" : "") + getClass().getSimpleName() + " (" + puntosVida + ")";
    }

    public static Monstruo generaMonstruoAleatorio() {
        Random rand = new Random();
        int prob = rand.nextInt(100);
        if (prob < 40)
            return new Orco();
        else if (prob < 70)
            return new Aranha();
        else if (prob < 90)
            return new Troll();
        else
            return new Dragon();
    }

    protected static int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}

class Orco extends Monstruo {
    public Orco() {
        super("Orco", randInt(30, 80), randInt(30, 50), randInt(30, 60), randInt(30, 100));
    }
}

class Troll extends Monstruo {
    public Troll() {
        super("Troll", randInt(60, 120), randInt(50, 70), randInt(20, 40), randInt(100, 200));
    }
}

class Aranha extends Monstruo {
    public Aranha() {
        super("Aranha", randInt(10, 50), randInt(20, 40), randInt(40, 70), randInt(30, 80));
    }
}

class Dragon extends Monstruo {
    public Dragon() {
        super("Dragon", randInt(100, 200), randInt(60, 100), randInt(80, 120), randInt(120, 250));
    }
}