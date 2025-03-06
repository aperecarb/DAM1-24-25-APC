package ud5.rol;

import java.util.Objects;

public class Item {
    private String nombre;
    private double peso;
    private int precio;

    public Item(String nombre, double peso, int precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Double.compare(item.peso, peso) == 0 && precio == item.precio && nombre.equals(item.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peso, precio);
    }

    @Override
    public String toString() {
        return nombre + ", peso: " + peso + " kilos, precio: " + precio + " monedas";
    }
}
