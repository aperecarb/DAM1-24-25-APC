package ud5.rol;

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

    private boolean esRazaValida(String raza) {
        return raza.equals("HUMANO") || raza.equals("ELFO") || raza.equals("ENANO") || 
            raza.equals("HOBBIT") || raza.equals("ORCO") || raza.equals("TROLL");
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza + ", Agilidad: " + agilidad + ", Constitución: " + constitucion);
        System.out.println("Nivel: " + nivel + ", Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosVida);
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosVida + "/" + (50 + constitucion) + ")";
    }
}
