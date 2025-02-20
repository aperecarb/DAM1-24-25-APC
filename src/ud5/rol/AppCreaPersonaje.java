package ud5.rol;

import java.io.*;
import java.util.*;
import com.google.gson.*;

public class AppCreaPersonaje {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";

public static void guardarPersonajes(List<Personaje> personajes) {
    try {
        File file = new File(FILE_PATH);
        file.getParentFile().mkdirs(); // Asegurar que la carpeta exista
        FileWriter writer = new FileWriter(file);
        new Gson().toJson(personajes, writer);
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static List<Personaje> cargarPersonajes() {
    try {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Personaje> personajes = new Gson().fromJson(reader, new TypeToken<List<Personaje>>() {}.getType());
        reader.close();
        return personajes != null ? personajes : new ArrayList<>();
    } catch (IOException e) {
        e.printStackTrace();
        return new ArrayList<>();
    }
}
}