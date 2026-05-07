package Partie3;

public class EX7 {

    public static <T extends Number> double somme(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static void main(String[] args) {
    	System.out.println("la somme :");
        System.out.println("(3, 7)= " + somme(3, 7));
        System.out.println("(1.5, 2.5)= " + somme(1.5, 2.5));
        System.out.println("(100L, 200L) = " + somme(100L, 200L));
    }
}