package ud5.rol;

public class PersonajeEx extends Personaje {
    private Item[] inventario;
    private int inventarioSize;
    private static final int MAX_ITEMS = 100;
    private Item itemManoIzq;
    private Item itemManoDch;
    private Armadura armaduraCabeza;
    private Armadura armaduraCuerpo;

    public PersonajeEx(String nombre, String raza, int fuerza, int agilidad, int constitucion) throws Exception {
        super(nombre, raza, fuerza, agilidad, constitucion);
        this.inventario = new Item[MAX_ITEMS];
        this.inventarioSize = 0;
    }

    public boolean addToInventario(Item item) {
        double cargaTotal = getCargaTotal() + item.getPeso();
        double cargaMaxima = 50 + getConstitucion() * 2;
                if (cargaTotal <= cargaMaxima && inventarioSize < MAX_ITEMS) {
                    inventario[inventarioSize++] = item;
                    return true;
                }
                return false;
            }
        
            private double getCargaTotal() {
        double carga = 0;
        for (int i = 0; i < inventarioSize; i++) {
            carga += inventario[i].getPeso();
        }
        return carga;
    }

    public boolean equipar(Item item) {
        if (item instanceof Armadura) {
            Armadura armadura = (Armadura) item;
            switch (armadura.getTipo()) {
                case YELMO:
                    if (armaduraCabeza == null) {
                        armaduraCabeza = armadura;
                        return true;
                    }
                    break;
                case ARMADURA:
                    if (armaduraCuerpo == null) {
                        armaduraCuerpo = armadura;
                        return true;
                    }
                    break;
                case ESCUDO:
                    if (itemManoIzq == null) {
                        itemManoIzq = armadura;
                        return true;
                    } else if (itemManoDch == null) {
                        itemManoDch = armadura;
                        return true;
                    }
                    break;
            }
        } else if (item instanceof Arma) {
            Arma arma = (Arma) item;
            if (arma.isDosManos()) {
                if (itemManoIzq == null && itemManoDch == null) {
                    itemManoIzq = arma;
                    itemManoDch = arma;
                    return true;
                }
            } else {
                if (itemManoDch == null) {
                    itemManoDch = arma;
                    return true;
                } else if (itemManoIzq == null) {
                    itemManoIzq = arma;
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + getNombre() + ":");
        for (int i = 0; i < inventarioSize; i++) {
            System.out.println((i + 1) + ". " + inventario[i]);
        }
        System.out.println("\nCarga total transportada: " + getCargaTotal() + "/" + (50 + getConstitucion() * 2) + " kilos\n");
    }
}