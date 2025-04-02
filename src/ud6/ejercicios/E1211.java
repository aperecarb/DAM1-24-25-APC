package ud6.ejercicios;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

class Socio implements Comparable<Socio>, Serializable {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    // Getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Socio otroSocio) {
        return this.dni.compareTo(otroSocio.dni);
    }

    public long antiguedad() {
        return LocalDate.now().toEpochDay() - fechaAlta.toEpochDay();
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}

public class E1211 {

    private static final String FICHERO_SOCIOS = "socios.dat";
    private static List<Socio> socios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        cargarSocios();
        menu();
    }

    private static void cargarSocios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO_SOCIOS))) {
            socios = (List<Socio>) ois.readObject();
        } catch (FileNotFoundException e) {
            // El fichero no existe, se crea uno nuevo al guardar
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void guardarSocios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_SOCIOS))) {
            oos.writeObject(socios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void menu() {
        int opcion;
        do {
            System.out.println("\n--- Gestión de Socios ---");
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por DNI");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    altaSocio();
                    break;
                case 2:
                    bajaSocio();
                    break;
                case 3:
                    modificarSocio();
                    break;
                case 4:
                    listarPorDNI();
                    break;
                case 5:
                    listarPorAntiguedad();
                    break;
                case 6:
                    guardarSocios();
                    System.out.println("Datos guardados. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void altaSocio() {
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de Alta (dd/MM/yyyy): ");
        String fechaAltaStr = scanner.nextLine();

        try {
            LocalDate fechaAlta = LocalDate.parse(fechaAltaStr, formatter);
            socios.add(new Socio(dni, nombre, fechaAlta));
            System.out.println("Socio dado de alta correctamente.");
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto.");
        }
    }

    private static void bajaSocio() {
        System.out.print("DNI del socio a dar de baja: ");
        String dni = scanner.nextLine();
        socios.removeIf(socio -> socio.getDni().equals(dni));
        System.out.println("Socio dado de baja.");
    }

    private static void modificarSocio() {
        System.out.print("DNI del socio a modificar: ");
        String dni = scanner.nextLine();
        for (Socio socio : socios) {
            if (socio.getDni().equals(dni)) {
                System.out.print("Nuevo nombre: ");
                socio.setNombre(scanner.nextLine());
                System.out.print("Nueva fecha de alta (dd/MM/yyyy): ");
                String fechaAltaStr = scanner.nextLine();
                try {
                    LocalDate fechaAlta = LocalDate.parse(fechaAltaStr, formatter);
                    socio.setFechaAlta(fechaAlta);
                    System.out.println("Socio modificado correctamente.");
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha incorrecto.");
                }
                return;
            }
        }
        System.out.println("Socio no encontrado.");
    }

    private static void listarPorDNI() {
        socios.sort(Comparator.comparing(Socio::getDni));
        System.out.println("\n--- Listado por DNI ---");
        socios.forEach(System.out::println);
    }

    private static void listarPorAntiguedad() {
        socios.sort(Comparator.comparing(Socio::antiguedad));
        System.out.println("\n--- Listado por Antigüedad ---");
        socios.forEach(System.out::println);
    }
}