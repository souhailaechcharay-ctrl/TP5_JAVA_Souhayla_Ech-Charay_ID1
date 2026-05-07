package Partie1;

public class EX7 {
    public static void C() {
        System.out.println("C() lance");
        throw new RuntimeException("Exception lancee depuis C() !");
    }
    public static void B() {
    	System.out.println("B() lance");
        System.out.println("B() ne gere pas");
        C();
    }
    public static void A() {
        System.out.println("A() lance");
        try {
            B();
        } catch (RuntimeException e) {
            System.out.println("A() gere l'exception : " + e.getMessage());
        }
        System.out.println("A() continue");
    }
    public static void main(String[] args) {
        A();
    }
}