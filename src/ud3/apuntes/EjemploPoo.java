package ud3.apuntes;

public class EjemploPoo {
    public static void main(String[] args) {

        Persona p;
        p = new Persona();

        p.inicializar("Arsenio", "Leante", "Gomez", 30);
        String nombre2 = p.nombreCompleto();
        if (p.esMayorEdad()) {
            System.out.println(nombre2 + " es mayor de edad");
        } else {
            System.out.println(nombre2 + " no es mayor de edad");
        }

        p.saludar();

        Persona p3 = new Persona();
        p3.inicializar("María", "Pérez", "Castro", 17);
        String nombre3 = p3.nombreCompleto();

        if (p3.esMayorEdad()) {
            System.out.println(nombre3 + " es mayor de edad");
        } else {
            System.out.println(nombre3 + " no es mayor de edad");
        }

        p3.saludar();

        Persona cumpleanhero = p;
        cumpleanhero.cumplirAnhos();
        System.out.println(cumpleanhero.nombreCompleto() + " tiene " + cumpleanhero.getEdad() + " años.");

        cumpleanhero = null;
        p = null;

        System.out.println(Persona.contadorPersonas);
        Persona.incrementarContador();
        System.out.println(Persona.contadorPersonas);
    }
}