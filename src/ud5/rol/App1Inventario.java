package ud5.rol;

public class App1Inventario {
    public static void main(String[] args) {
        try {
            System.out.println("1. Inventario de personaje");
            System.out.println("==========================\n");
            
            PersonajeEx arturo = new PersonajeEx("Arturo", "HUMANO", 50, 40, 60);
            
            Item[] items = {
                new Item("Cota de Malla", 10.0, 2000),
                new Item("Espada larga", 3.0, 10000),
                new Item("Espadón a dos manos", 5.0, 1000),
                new Item("Pan", 1.0, 1),
                new Item("Agua", 2.0, 1),
                new Item("Daga", 0.5, 200),
                new Item("Antorcha", 0.75, 10)
            };
            
            for (Item item : items) {
                arturo.addToInventario(item);
            }
            
            arturo.mostrarInventario();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
