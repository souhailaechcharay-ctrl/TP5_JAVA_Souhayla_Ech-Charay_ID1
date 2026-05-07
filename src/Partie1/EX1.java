package Partie1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EX1 {
	  public static void calculer(int a, int b) {
	        try {
	            int resultat = a / b;
	            System.out.println("Resultat : " + resultat);
	        }catch (ArithmeticException e) {
	            System.out.println("Erreur : division par 0");
	        }catch (InputMismatchException e) {
	        	System.out.println("Erreur de syntax invalide ");
	        }
	  }
	  public static void division(int a, int b) throws ArithmeticException ,InputMismatchException{
	        int resultat = a / b;
	        System.out.println("Resultat  : " + resultat);
	    }
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Entrez les deux nombres ");
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            calculer(a, b);
	            division(a, b);
	        } catch (InputMismatchException e) {
	            System.out.println("Erreur : saisie invalide");
	        }
	        sc.close();
	    }
}
