package ud5.inmobiliaria;

class Piso extends Inmueble {
    private int planta;

    public Piso(String direccion, int metrosCuadrados, int habitaciones, int baños, int planta) {
        super(direccion, metrosCuadrados, habitaciones, baños);
        this.planta = planta;
    }

    @Override
    public String detalle() {
        return "Piso en " + direccion + ":\n" + metrosCuadrados + " m2, " + habitaciones + " hab, " + baños + " baños, " + planta + "ª planta.\n" + "Precio de Alquiler: " + (precioAlquiler > 0 ? precioAlquiler + " €" : "No disponible") + "\n" + "Precio de Venta: " + (precioVenta > 0 ? precioVenta + " €" : "No disponible");
    }
}