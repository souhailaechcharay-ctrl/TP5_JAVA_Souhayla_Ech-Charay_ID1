package Partie1;

import java.util.Scanner;

public class EX8 {
    public static void verifierAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age invalide");
        }
        System.out.println("Age valide");
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entrer votre age :");
    	int age = sc.nextInt();
    	try {
            verifierAge(age);
        } catch (Exception e) {
            System.out.println("[Exception] " + e.getMessage());
        }
    	sc.close();
    	}
}