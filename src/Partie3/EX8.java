package Partie3;

public class EX8 {

    static class Animal<T> {
        T nom;

        public Animal(T nom) { 
        	this.nom = nom; 
        }
        public void afficher() {
            System.out.println("Animal : " + nom);
        }
    }
    static class Chien extends Animal<String> {
        public Chien(String nom) {
        	super(nom); 
        }
        public void afficher() {
            System.out.println("Chien : " + nom);
        }
    }
    public static void main(String[] args) {
        Animal<String> a = new Animal<>("Chat");
        a.afficher();
        Chien c = new Chien("Rockey");
        c.afficher();
    }
}