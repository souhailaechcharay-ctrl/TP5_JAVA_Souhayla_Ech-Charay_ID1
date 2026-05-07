package Partie1;

import java.util.Scanner;

public class EX2 {
    public static void afficherLongueurSansException(String s) {
        if (s != null) {
            System.out.println("Longueur est : " + s.length());
        } else {
            System.out.println("La chaîne est null");
        }
    }
    public static void afficherLongueurAvecException(String s) {
        try {
            System.out.println("Longueur est " + s.length());
        } catch (NullPointerException e) {
            System.out.println("La chaîne est null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne ");
        String saisie = sc.nextLine();
        String chaine = saisie.isEmpty() ? null : saisie;
        System.out.println("La longueur sans try/catch :");
        afficherLongueurSansException(chaine);
        System.out.println("La longueur avec try/catch:");
        afficherLongueurAvecException(chaine);
        sc.close();
    }
}