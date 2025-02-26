package ud5.herenciaejercicios;

class Punto {
    public int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        
    }
}