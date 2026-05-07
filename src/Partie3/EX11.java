package Partie3;

import java.util.Arrays;
import java.util.List;

public class EX11 {

    public static void afficherListe(List<?> liste) {
        for (Object i : liste) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> listeStr = Arrays.asList("Rouge", "Vert", "Bleu");
        List<Integer> listeInt = Arrays.asList(20, 45, 15);
        List<Double> listeDbl = Arrays.asList(1.6, 3.8, 8.39);
        afficherListe(listeStr);
        afficherListe(listeInt);
        afficherListe(listeDbl);
    }
}