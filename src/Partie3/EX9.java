package Partie3;

public class EX9 {

    static class Vehicule<T> {
        T vitesse;

        public Vehicule(T vitesse) { 
        	this.vitesse = vitesse; 
        }
        public void afficherVitesse() {
            System.out.println("Vitesse : " + vitesse);
        }
    }
    static class Voiture<T> extends Vehicule<T> {
        private String marque;

        public Voiture(String marque, T vitesse) {
            super(vitesse);
            this.marque = marque;
        }
        public void affichermarque() {
        	System.out.println("marque : " + marque);
        }
    }
    public static void main(String[] args) {
    	Vehicule<Integer> v = new Vehicule<>(120);
        v.afficherVitesse();
        Voiture<Double> w = new Voiture<>("Renault", 160.5);
        w.affichermarque();
        w.afficherVitesse();
    }
}