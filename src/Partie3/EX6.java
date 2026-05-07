package Partie3;

public class EX6 {

    public static <T> void afficherTableau(T[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ",");
        }
        System.out.print("\n");
    }
    public static <T> T getPremier(T[] tableau) {
        if (tableau == null || tableau.length == 0)
            throw new IllegalArgumentException("Tableau vide ou null !");
        return tableau[0];
    }
    public static void main(String[] args) {
        Integer[] tabInt = {1, 2, 3, 4, 5};
        String[]  tabStr = {"Java", "web", "CSS"};
        afficherTableau(tabInt);
        afficherTableau(tabStr);
        System.out.println("Premier Integer : " + getPremier(tabInt));
        System.out.println("Premier String  : " + getPremier(tabStr));
    }
}