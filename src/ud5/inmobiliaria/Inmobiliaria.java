package ud5.inmobiliaria;

import java.util.Arrays;
import java.util.Comparator;

abstract class Inmueble implements Comparable<Inmueble> {
    public String direccion;
    public int metrosCuadrados;
    public int habitaciones;
    public int baños;
    public double precioAlquiler;
    public double precioVenta;

    public Inmueble(String direccion, int metrosCuadrados, int habitaciones, int baños) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.precioAlquiler = 0;
        this.precioVenta = 0;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public abstract String detalle();

    @Override
    public String toString() {
        return "Inmueble en " + direccion + " (" + metrosCuadrados + " m2, " + habitaciones + " hab)";
    }

    // Orden natural: alfabéticamente por dirección
    @Override
    public int compareTo(Inmueble otro) {
        return this.direccion.compareToIgnoreCase(otro.direccion);
    }

    // Métodos estáticos de ordenación solicitados
    public static void sortMetrosDesc(Inmueble[] t) {
        Arrays.sort(t, (a, b) -> Integer.compare(b.metrosCuadrados, a.metrosCuadrados));
    }

    public static void sortHabAMetrosDesc(Inmueble[] t) {
        Arrays.sort(t, (a, b) -> {
            int cmp = Integer.compare(b.habitaciones, a.habitaciones);
            if (cmp == 0) {
                return Integer.compare(b.metrosCuadrados, a.metrosCuadrados);
            }
            return cmp;
        });
    }

    public static void sortPrecioAlquilerAsc(Inmueble[] t) {
        Arrays.sort(t, (a, b) -> Double.compare(a.precioAlquiler, b.precioAlquiler));
    }

    public static void sortPrecioVentaAsc(Inmueble[] t) {
        Arrays.sort(t, (a, b) -> Double.compare(a.precioVenta, b.precioVenta));
    }

    // Mostrar lista de inmuebles
    public static void mostrarInmuebles(Inmueble[] t) {
        for (Inmueble i : t) {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {
        Inmueble piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5);
        piso1.setPrecioAlquiler(500);
        piso1.setPrecioVenta(200000);

        Inmueble piso2 = new Piso("Praza Maior", 80, 2, 2, 3);
        piso2.setPrecioAlquiler(400);
        piso2.setPrecioVenta(150000);

        Inmueble piso3 = new Piso("Calle Rosalía de Castro", 140, 4, 2, 2);
        piso3.setPrecioVenta(250000);

        Inmueble casa1 = new Casa("Carretera de Marín", 250, 4, 3, 3000);
        casa1.setPrecioAlquiler(800);
        casa1.setPrecioVenta(350000);

        Inmueble casa2 = new Casa("Lapaman", 150, 3, 2, 1000);
        casa2.setPrecioVenta(400000);

        Inmueble[] inmuebles = { piso1, piso2, piso3, casa1, casa2 };

        System.out.println("\nTODOS LOS INMUEBLES:");
        mostrarInmuebles(inmuebles);

        Arrays.sort(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS ALFABÉTICAMENTE:");
        mostrarInmuebles(inmuebles);

        Arrays.sort(inmuebles, Comparator.comparingInt(i -> i.metrosCuadrados));
        System.out.println("\nINMUEBLES ORDENADOS POR m2 (ascendente):");
        mostrarInmuebles(inmuebles);

        sortMetrosDesc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR m2 (descendente):");
        mostrarInmuebles(inmuebles);

        sortHabAMetrosDesc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR HABITACIONES Y LUEGO m2 (descendente):");
        mostrarInmuebles(inmuebles);

        sortPrecioAlquilerAsc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR PRECIO ALQUILER (ascendente):");
        mostrarInmuebles(inmuebles);

        sortPrecioVentaAsc(inmuebles);
        System.out.println("\nINMUEBLES ORDENADOS POR PRECIO VENTA (ascendente):");
        mostrarInmuebles(inmuebles);
    }
}