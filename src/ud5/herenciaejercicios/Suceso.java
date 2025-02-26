class Suceso extends Punto3D {
    private int tiempo;
    private String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descripcion) {
        super(x, y, z);
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Suceso)) return false;
        Suceso otro = (Suceso) obj;
        return super.equals(otro) && this.tiempo == otro.tiempo && this.descripcion.equals(otro.descripcion);
    }
}