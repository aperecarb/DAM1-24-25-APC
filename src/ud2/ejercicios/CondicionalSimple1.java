package ud2.ejercicios;

import java.util.Scanner;

public class CondicionalSimple1 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.print("Nota: ");
        int nota = sc.nextInt();
        
        if (nota >= 5){                                            
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        }
        System.out.println("Hasta Pronto!");

        sc.close();
    }
}
