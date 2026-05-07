package Partie1;

import java.util.Scanner;

public class EX4 {
    public static int convertirEnEntier(String s) {
        try {
            int valeur = Integer.parseInt(s);
            System.out.println("Conversion reussie de " + s + " en " + valeur);
            return valeur;
        } catch (NumberFormatException e) {
            System.out.println(s + " n'est pas un entier valide");
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une valeur a convertir en entier : ");
        String saisie = sc.nextLine();
        convertirEnEntier(saisie);
        sc.close();
    }
}