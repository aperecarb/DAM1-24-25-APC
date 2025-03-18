package ud5;

import java.util.*;

public class Bingo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Introduce el número de jugadores: ");
        int numJugadores = sc.nextInt();
        sc.nextLine();

        List<Jugador> jugadores = new ArrayList<>();
        List<String> nombresJugadores = new ArrayList<>();

        for (int i = 0; i < numJugadores; i++) {
            String nombre;
            do {
                System.out.print("Introduce el nombre del jugador " + (i + 1) + ": ");
                nombre = sc.nextLine();
                if (nombresJugadores.contains(nombre)) {
                    System.out.println("El nombre ya existe. Introduce otro.");
                }
            } while (nombresJugadores.contains(nombre));
            nombresJugadores.add(nombre);

            int numCartones;
            do {
                System.out.print("Introduce el número de cartones para " + nombre + " (máximo 5): ");
                numCartones = sc.nextInt();
                if (numCartones < 1 || numCartones > 5) {
                    System.out.println("Número de cartones inválido. Debe ser entre 1 y 5.");
                }
            } while (numCartones < 1 || numCartones > 5);
            sc.nextLine();

            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores.add(jugador);
        }

        // Mostrar los cartones de los jugadores
        for (Jugador jugador : jugadores) {
            System.out.println("\nCartones de " + jugador.getNombre() + ":");
            for (int i = 0; i < jugador.getNumCartones(); i++) {
                System.out.println("Cartón " + (i + 1) + ":");
                jugador.getCartones().get(i).mostrarCarton();
            }
        }

        System.out.println("\n¿Modo de juego? (1: Turno a turno, 2: Automático): ");
        int modoJuego = sc.nextInt();
        sc.nextLine();

        List<Integer> bolasSacadas = new ArrayList<>();
        boolean bingo = false;
        Jugador jugadorLinea = null;

        while (!bingo) {
            int bola;
            do {
                bola = rnd.nextInt(99) + 1;
            } while (bolasSacadas.contains(bola));
            bolasSacadas.add(bola);

            System.out.println("\nBola sacada: " + bola);

            for (Jugador jugador : jugadores) {
                for (Carton carton : jugador.getCartones()) {
                    carton.marcarNumero(bola);
                    if (carton.comprobarLinea() && jugadorLinea == null) {
                        jugadorLinea = jugador;
                        System.out.println("¡Línea de " + jugador.getNombre() + "!");
                    }
                    if (carton.comprobarBingo()) {
                        System.out.println("¡Bingo de " + jugador.getNombre() + "!");
                        bingo = true;
                    }
                }
            }

            if (modoJuego == 1 && !bingo) {
                mostrarClasificacion(jugadores);
                System.out.print("Pulsa Enter para continuar...");
                sc.nextLine();
            }
        }

        if (jugadorLinea != null) {
            System.out.println("\nPrimer jugador en obtener línea: " + jugadorLinea.getNombre());
        }

        mostrarClasificacion(jugadores);

        sc.close();
    }

    private static void mostrarClasificacion(List<Jugador> jugadores) {
        Collections.sort(jugadores, Comparator.comparingInt(Jugador::getPuntuacion).reversed());
        System.out.println("\nClasificación:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntuacion() + " aciertos");
        }
    }

    static class Jugador {
        private String nombre;
        private List<Carton> cartones;
        private int puntuacion;

        public Jugador(String nombre, int numCartones) {
            this.nombre = nombre;
            this.cartones = new ArrayList<>();
            this.puntuacion = 0;
            for (int i = 0; i < numCartones; i++) {
                this.cartones.add(new Carton());
            }
        }

        public String getNombre() {
            return nombre;
        }

        public List<Carton> getCartones() {
            return cartones;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void incrementarPuntuacion() {
            this.puntuacion++;
        }

        public int getNumCartones() {
            return cartones.size();
        }
    }

    static class Carton {
        private int[][] numeros;
        private boolean[][] marcados;

        public Carton() {
            this.numeros = new int[3][5];
            this.marcados = new boolean[3][5];
            generarCarton();
        }

        private void generarCarton() {
            List<Integer> numerosDisponibles = new ArrayList<>();
            for (int i = 1; i <= 99; i++) {
                numerosDisponibles.add(i);
            }
            Collections.shuffle(numerosDisponibles);

            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    numeros[i][j] = numerosDisponibles.get(index++);
                }
            }
        }

        public void mostrarCarton() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%2d ", numeros[i][j]);
                }
                System.out.println();
            }
        }

        public void marcarNumero(int numero) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (numeros[i][j] == numero) {
                        marcados[i][j] = true;
                    }
                }
            }
        }

        public boolean comprobarLinea() {
            for (int i = 0; i < 3; i++) {
                boolean lineaCompleta = true;
                for (int j = 0; j < 5; j++) {
                    if (!marcados[i][j]) {
                        lineaCompleta = false;
                        break;
                    }
                }
                if (lineaCompleta) {
                    return true;
                }
            }
            return false;
        }

        public boolean comprobarBingo() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (!marcados[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}