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
            if (x != -1) {
                break;
            }
        }

        if (x == -1 || y == -1) {
            return false;
        }

        int[][] dirs = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        int dir = 0;

        for (char instr : instrucciones.toCharArray()) {
            if (instr == 'A') {
                int nuevoX = x + dirs[dir][0];
                int nuevoY = y + dirs[dir][1];

                if (nuevoX < 0 || nuevoX >= fil || nuevoY < 0 || nuevoY >= col) {
                    return false;
                }

                if (mapa[nuevoX].charAt(nuevoY) == '*') {
                    return false;
                }

                x = nuevoX;
                y = nuevoY;
            } else if (instr == 'R') {
                dir = (dir + 1) % 4;
            } else if (instr == 'L') {
                dir = (dir + 3) % 4;
            } else {
                return false;
            }
        }
        return mapa[x].charAt(y) == 'Z';
    }
}