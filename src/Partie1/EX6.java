package Partie1;

public class EX6 {
    static class Machine {
        private boolean estAllumee = false;

        public void demarrer() {
            if (estAllumee) {
                throw new IllegalStateException("La machine est deja allumee");
            }
            estAllumee = true;
            System.out.println("Etat : ON");
        }
        public void arreter() {
            if (!estAllumee) {
                throw new IllegalStateException("La machine est deja eteinte");
            }
            estAllumee = false;
            System.out.println("Etat : OFF");
        }
    }
    public static void testerDemarrer(Machine m) {
        try {
            m.demarrer();
        } catch (IllegalStateException e) {
            System.out.println("[IllegalStateException] " + e.getMessage());
        }
    }
    public static void testerArreter(Machine m) {
        try {
            m.arreter();
        } catch (IllegalStateException e) {
            System.out.println("[IllegalStateException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Machine m = new Machine();
        testerDemarrer(m);
        testerDemarrer(m);
        testerArreter(m);
        testerArreter(m); 
    }
}