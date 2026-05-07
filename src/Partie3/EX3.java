package Partie3;

public class EX3 {

    interface Calcul<T> {
        T addition(T a, T b);
    }
    static class CalculInteger implements Calcul<Integer> {
        public Integer addition(Integer a, Integer b) { 
        	return a + b; 
        	}
    }
    static class CalculDouble implements Calcul<Double> {
        public Double addition(Double a, Double b) { 
        	return a + b; 
        	}
    }
    public static void main(String[] args) {
        System.out.println("Calcul Integer");
        CalculInteger c = new CalculInteger();
        System.out.println("10 + 5 = " + c.addition(20, 5));
        System.out.println("Calcul Double");
        CalculDouble b = new CalculDouble();
        System.out.println("3.5 + 2.1 = " + b.addition(13.5, 2.1));
    }
}