package ud5.inmobiliaria;

class Casa extends Inmueble {
    private int terrenoM2;

    public Casa(String direccion, int metrosCuadrados, int habitaciones, int baños, int terrenoM2) {
        super(direccion, metrosCuadrados, habitaciones, baños);
        this.terrenoM2 = terrenoM2;
    }

    @Override
    public String detalle() {
        return "Casa en " + direccion + ":\n" + metrosCuadrados + " m2, " + habitaciones + " hab, " + baños + " baños, con terreno de " + terrenoM2 + " m2.";
    }
}