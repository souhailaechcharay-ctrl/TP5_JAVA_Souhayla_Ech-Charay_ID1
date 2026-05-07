package Partie1;

import java.util.Scanner;

public class EX3 {
    public static void accederAvecIf(int[] tab, int index) {
        if (index >= 0 && index < tab.length) {
            System.out.println("tab[" + index + "] = " + tab[index]);
        } else {
            System.out.println("L'index est hors limites du tableau");
        }
    }
    public static void accederAvecTryCatch(int[] tab, int index) {
        try {
            System.out.println("tab[" + index + "] = " + tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'index est hors limites du tableau");
        }
    }
    public static void main(String[] args) {
        int[] tableau = {35,49,46,96,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un index:");
        int index = Integer.parseInt(sc.nextLine());
        accederAvecIf(tableau, index);
        accederAvecTryCatch(tableau, index);
        sc.close();
    }
}