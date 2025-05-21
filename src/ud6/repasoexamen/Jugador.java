/* EP1237. Queremos gestionar la plantilla de un equipo de fútbol, en la que a cada jugador se le asigna un dorsal que no puede estar repetido. Para ello vamos a crear una estructura de tipo Map cuyas entradas corresponden a los jugadores, con el dorsal como
 clave y un objeto de la clase Jugador como valor. De cada jugador se guarda el DNI, el nombre, la posición en el campo - para simplificar, los jugadores pueden ser porteros, defensas, centrocampistas y delanteros - y su estatura. Define la clase Jugador y
  un enumerado para la posición en el campo, e implementa los siguientes métodos estáticos:

static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador), que añade una entrada al mapa con el dorsal pasado como parámetro y el jugador creado dentro del método.
static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal), que elimina la entrada correspondiente al jugador cuyo dorsal se pasa como parámetro. Dicho dorsal desaparece del mapa hasta que se asigne a otro jugador por medio de un alta.
El método devuelve el jugador eliminado.
static void mostrar (Map<Integer, Jugador> plantilla), que muestra una lista de los dorsales con los nombres de los jugadores correspondientes.
dorsal - jugador
dorsal2 - jugador2
…

static void mostrar (Map<Integer, Jugador> plantilla, String posicion), que muestra una lista de los jugadores que comparten una misma posición. Por ejemplo, todos los defensas o todos los delanteros. 
static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador), que permite modificar los datos de un jugador, excepto su dorsal y su DNI. Devuelve true si el dorsal existe y false en caso contrario.

 */

package ud6.repasoexamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

public class Jugador implements Comparable<Jugador> {
    private String Nombre;
    private Posicion posicion;
    private int estatura;
    private String dni;

    public Jugador(String dni, String nombre, Posicion posicion, int estatura) {
        this.dni = dni;
        Nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (plantilla.containsKey(dorsal)) {
           
        }else{
             plantilla.put(dorsal, jugador);
        }
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
       
           return plantilla.remove(dorsal);
        
        
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla,Posicion posicion) {
        
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
           if (entry.getValue().getPosicion()==posicion) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
           }
            
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador){
        if (plantilla.containsKey(dorsal)) {
            Jugador jugadorExistente = plantilla.get(dorsal);
            jugadorExistente.setNombre(jugador.getNombre());
            jugadorExistente.setPosicion(jugador.getPosicion());
            jugadorExistente.setEstatura(jugador.getEstatura());
            return true;
        }else{
            return false;
        }

    }

   
        public static void main(String[] args) {
        // antes de nada, hayq eu implementar el hashmap
        // treeMap te lo ordena
        Map<Integer, Jugador> plantilla = new HashMap<>();

        // creo 2 jugadores
        // No enclosing instance of type Futbol is accessible. Must qualify the
        // allocation with an enclosing instance of type Futbol (e.g. x.new A() where x
        // is an instance of Futbol). -- se arregla PONIENDO EL STATIC EN LA CLASE
        Jugador j1 = new Jugador("12345678A", "Pedro", Posicion.DEFENSA, 182);
        Jugador j2 = new Jugador("12345678A", "Pedro", Posicion.DEFENSA, 182);
        Jugador j3 = new Jugador("12678A", "Antonio", Posicion.CENTROCAMPISTA, 142);

        Jugador.altaJugador(plantilla, 1, j1);
        Jugador.altaJugador(plantilla, 2, j2);
        Jugador.mostrar(plantilla);
        // es un enum, asi q en la implementacion del metodo se cambia del valor del
        // string
        System.out.println("Lista de jugadores:");
        System.out.println(plantilla);
            
        Jugador.mostrar(plantilla, Posicion.DEFENSA);

        Jugador.editarJugador(plantilla, 2, j3);
        Jugador.mostrar(plantilla, Posicion.CENTROCAMPISTA);
            List<Jugador> listaLista = new ArrayList<>();
            listaLista.add(j1);
            listaLista.add(j2);
            listaLista.add(j3);
            Jugador[] lista ={j1,j2,j3};
            Arrays.sort(lista , c1.reversed());
            
            listaLista.sort(c1.reversed());
        }
        
      static  Comparator<Jugador> c1 = (j1, j2) -> j1.getEstatura()-j2.getEstatura(); 
     static   Comparator<Jugador> c2 = (j1,j2) -> j1.getDni().compareTo(j2.getDni());

     @Override
     public int compareTo(Jugador o) {
       return getEstatura()-o.getEstatura();
     }
       

       
       
     
       

}