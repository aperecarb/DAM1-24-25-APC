package ud3.ejerciciosclases;

public class Calendario {
    private int year, mes, dia;

    public Calendario(int year, int mes, int dia) {
        if (fechaCorrecta(year, mes, dia)) {
            this.year = year;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("La fecha no es correcta");
        }
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasMes(mes, year)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    void incrementarAño(int cantidad) {
        year += cantidad;
        if (year == 0)
            year = cantidad < 0 ? -1 : 1;
    }

    public static int diasMes(int mes, int year) {
        if (mes < 1 || mes > 12)
            return -1;

        switch (mes) {
            case 2:
                if (esBisiesto(year))
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean esBisiesto(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static boolean fechaCorrecta(int year, int mes, int dia) {
        boolean diaCorrecto, mesCorrecto, yearCorrecto;
        yearCorrecto = (year != 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        diaCorrecto = (dia >= 1 && dia <= diasMes(mes, year));

        return diaCorrecto && mesCorrecto && yearCorrecto;
    }

    public boolean iguales(Calendario otraFecha) {
        return dia == otraFecha.dia && mes == otraFecha.mes && year == otraFecha.year;
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + year);
    }

    public int getYear() {
        return year;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
}
