package ud4.ejercicios;

import java.util.Random;

public class ConceptosProgramacion {
    static String fraseAleatoria(String[] t) {
        Random random = new Random(); 
        int val = random.nextInt(t.length);
        return t[val];
    }

    public static void main(String[] args) { 
        String[] frases = {"Algoritmo", "Lenguaje de programación", "Entorno de desarrollo", "Compilación", "Ejecución", "Código fuente", "Bytecode", "Código objeto"};

        String fraseAleatoria = fraseAleatoria(frases); 
        System.out.println("\n" + fraseAleatoria + "\n");
    } 
}