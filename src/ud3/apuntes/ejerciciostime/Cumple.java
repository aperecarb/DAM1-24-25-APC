package ud3.apuntes.ejerciciostime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cumple {
    public static void main(String[] args) {
        LocalDate nacimiento = null;

        LocalDate hoy = LocalDate.now();

        boolean fechaCorrecta = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fecha = sc.nextLine();

            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                nacimiento = LocalDate.parse(fecha, formatoFecha);
                if (hoy.isAfter(nacimiento))
                    fechaCorrecta = true;
                else
                    System.out.println("La fecha de nacimiento no puede ser igual o posterior a la fecha actual.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!fechaCorrecta);
        sc.close();

        if (hoy.getMonthValue() == nacimiento.getMonthValue() &&
                hoy.getDayOfMonth() == nacimiento.getDayOfMonth()) {
            System.out.println("Hoy es tu cumpleaños!! Falta un año para el siguiente.");

        } else if (hoy.getMonthValue() < nacimiento.getMonthValue() ||
                (hoy.getMonthValue() == nacimiento.getMonthValue()
                        && hoy.getDayOfMonth() < nacimiento.getDayOfMonth())) {
            LocalDate proximoCumple = LocalDate.of(hoy.getYear(), nacimiento.getMonthValue(),
                    nacimiento.getDayOfMonth());
            Period duracion = Period.between(hoy, proximoCumple);
            System.out.println(
                    "Faltan " + duracion.getMonths() + " meses y " + duracion.getDays() + " días para tu cumple.");

        } else {
            LocalDate proximoCumple = LocalDate.of(hoy.getYear() + 1, nacimiento.getMonthValue(),
                    nacimiento.getDayOfMonth());
            Period duracion = Period.between(hoy, proximoCumple);
            System.out.println(
                    "Faltan " + duracion.getMonths() + " meses y " + duracion.getDays() + " días para tu cumple.");
        }
    }

}
