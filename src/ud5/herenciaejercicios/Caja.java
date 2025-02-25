package ud5.herenciaejercicios;

public class Caja {
    public enum Unidad {cm, m}

    public final int ancho;
    public final int alto;
    public final int fondo;
    public final Unidad unidad;
    public String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    public double getVolumen() {
        double factor = (unidad == Unidad.cm) ? 0.000001 : 1.0;
        return (ancho * alto * fondo) * factor;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            this.etiqueta = etiqueta.substring(0, 30);
        }
    }

    @Override
    public String toString() {
        return "Caja [" + ancho + "x" + alto + "x" + fondo + " " + unidad + "], Volumen: " + getVolumen() + " m³, Etiqueta: " + etiqueta;
    }
}