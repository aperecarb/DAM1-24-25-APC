package bucles;

public class E0310 {
    public static void main(String[] args) {
        final int NUM_REP = 100;
        int n = 3;
        for (int i = 0; i < NUM_REP; i++) {
            System.out.println(n);
            n += 3;
        }
    }
}