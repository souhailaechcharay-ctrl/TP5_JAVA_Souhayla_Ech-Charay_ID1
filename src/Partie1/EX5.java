package Partie1;

public class EX5 {
    public static double racineCarree(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Le calcule de sqrt d'un negatif est impossible");
        }
        return Math.sqrt(x);
    }
    public static void testerRacine(int x) {
        try {
            System.out.println("sqrt(" + x + ") = " + racineCarree(x));
        } catch (IllegalArgumentException e) {
            System.out.println("[IllegalArgumentException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        testerRacine(25);
        testerRacine(0);
        testerRacine(49);
        testerRacine(-25);
    }
}