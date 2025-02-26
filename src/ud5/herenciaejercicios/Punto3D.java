package ud5.herenciaejercicios;

class Punto3D extends Punto {
    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) {
            Punto3D otroPunto3D = (Punto3D) otroPunto;
            int dz = this.z - otroPunto3D.z;
            return Math.sqrt((this.x - otroPunto3D.x) * (this.x - otroPunto3D.x) +
                             (this.y - otroPunto3D.y) * (this.y - otroPunto3D.y) +
                             dz * dz);
        }
        return super.distancia(otroPunto);
    }
}