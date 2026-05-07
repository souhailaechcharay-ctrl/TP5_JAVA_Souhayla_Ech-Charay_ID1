package Partie3;

import java.util.Arrays;
import java.util.List;

public class EX12 {

    public static void afficherNombres(List<? extends Number> liste) {
        System.out.print("Nombres : ");
        double somme = 0;
        for (Number i : liste) {
            System.out.print(i + " ");
            somme += i.doubleValue();
        }
        System.out.println();
        System.out.println("Somme = " + somme);
    }
    public static void main(String[] args) {
        List<Integer> listeInt = Arrays.asList(1, 2, 3, 4);
        List<Double>  listeDbl = Arrays.asList(1.6, 3.8, 8.39);
        afficherNombres(listeInt);
        System.out.println();
        afficherNombres(listeDbl);
    }
}