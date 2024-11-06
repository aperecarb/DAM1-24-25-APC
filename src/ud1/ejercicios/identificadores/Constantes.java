package identificadores;

public class Constantes {
    public static void main(String[] args) {
        final int N_ALUMNOS = 32;
        int N_SEMANA = 9;
        final int N_SESIONES = 32*N_SEMANA;
        final int N_MESES = 12; 

        System.out.println("Numero de alumnos matriculados en el modulo de Programacion: " + N_ALUMNOS);
        System.out.println("Numero total de sesiones del modulo de Programacion en el curso lectivo:  " + N_SESIONES);
        System.out.println("Numero de sesiones semanales en el modulo de Programacion: " + N_SEMANA);
        System.out.println("Numero de meses del año: " + N_MESES);    
    }  
}
