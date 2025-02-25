package ud5.herenciaejercicios;

public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    public double getSuperficie() {
        int ancho = super.ancho;
        int alto = super.alto;
        int fondo = super.fondo;
        
        return 2 * ((ancho * alto) + (ancho * fondo) + (alto * fondo));
    }

    @Override
    public String toString() {
        return super.toString() + ", Superficie Cartón: " + getSuperficie() + " cm²";
    }
}