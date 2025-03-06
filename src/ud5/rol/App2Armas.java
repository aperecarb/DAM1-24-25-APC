package ud5.rol;

public class App2Armas {
    public static void main(String[] args) {
        try {
            System.out.println("2. Armas y Armaduras");
            System.out.println("====================\n");
            
            PersonajeEx valkiria = new PersonajeEx("Valkiria", "HUMANO", 60, 50, 70);
            PersonajeEx arturo = new PersonajeEx("Arturo", "HUMANO", 50, 40, 60);
            
            Armadura yelmoHierro = new Armadura("Yelmo de hierro", 2.0, 500, 5, Armadura.Tipo.YELMO);
            Armadura cotaMalla = new Armadura("Cota de Malla", 10.0, 2000, 20, Armadura.Tipo.ARMADURA);
            Arma espadaLarga = new Arma("Espada larga", 3.0, 10000, 60);
            Armadura escudoMadera = new Armadura("Escudo de madera", 5.0, 500, 10, Armadura.Tipo.ESCUDO);
            
            Armadura yelmoPlata = new Armadura("Yelmo de plata", 2.0, 800, 5, Armadura.Tipo.YELMO);
            Armadura coraza = new Armadura("Coraza", 12.0, 3000, 30, Armadura.Tipo.ARMADURA);
            Arma espadon = new Arma("Espadón a dos manos", 6.0, 15000, 50, true);
            
            valkiria.equipar(yelmoHierro);
            valkiria.equipar(cotaMalla);
            valkiria.equipar(espadaLarga);
            valkiria.equipar(escudoMadera);
            
            arturo.equipar(yelmoPlata);
            arturo.equipar(coraza);
            arturo.equipar(espadon);
            
            System.out.println("Equipo de combate de Valkiria:");
            valkiria.mostrarInventario();
            System.out.println("\nEquipo de combate de Arturo:");
            arturo.mostrarInventario();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
