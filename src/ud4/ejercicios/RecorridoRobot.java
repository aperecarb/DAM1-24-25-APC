package ud4.ejercicios;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };

        System.out.println(recorridoRobot(mapa, "AALARAARAA"));
        System.out.println(recorridoRobot(mapa, "RAALAAAALA"));
        System.out.println(recorridoRobot(mapa, "ARALA"));
        System.out.println(recorridoRobot(mapa, "LAA"));
    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        int fil = mapa.length;
        int col = mapa[0].length();

        int x = -1, y = -1;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (mapa[i].charAt(j) == 'A') {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (x != -1)
                break;
        }

        if (x == -1 || y == -1) {
            return false;
        }

        int[][] direcciones = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        int direccion = 0;

        for (char instr : instrucciones.toCharArray()) {
            if (instr == 'A') {
                int nuevoX = x + direcciones[direccion][0];
                int nuevoY = y + direcciones[direccion][1];

                if (nuevoX < 0 || nuevoX >= fil || nuevoY < 0 || nuevoY >= col)
                    return false;

                if (mapa[nuevoX].charAt(nuevoY) == '*')
                    return false;

                x = nuevoX;
                y = nuevoY;
            } else if (instr == 'R') {
                direccion = (direccion + 1) % 4;
            } else if (instr == 'L') {
                direccion = (direccion + 3) % 4;
            } else {
                return false;
            }
        }
        return mapa[x].charAt(y) == 'Z';
    }
}