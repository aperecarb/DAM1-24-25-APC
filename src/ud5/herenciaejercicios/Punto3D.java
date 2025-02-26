package ud5.herenciaejercicios;

class Punto3D extends Punto {
    public int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) {
            Punto3D otroPunto3D = (Punto3D) otroPunto;
            int dx = this.x - otroPunto.x;
            int dy = this.y - otroPunto.y;
            int dz = this.z - otroPunto3D.z;
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        }
        return super.distancia(otroPunto);
    }
}