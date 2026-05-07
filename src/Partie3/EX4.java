package Partie3;

public class EX4 {

    interface Comparateur<T> {
        int comparer(T a, T b);
    }

    static class ComparateurInteger implements Comparateur<Integer> {
        public int comparer(Integer a, Integer b) { 
        	return Integer.compare(a, b); 
        }
    }
    static class ComparateurString implements Comparateur<String> {
        public int comparer(String a, String b) {
            return Integer.compare(a.length(), b.length());
        }
    }
    public static void afficherComparaisonInt(int a,int  b, int resultat) {
        String msg = resultat < 0 ? a + " < " + b :resultat > 0 ? a + " > " + b : a + " = " + b;
        System.out.println("Resultat de comparaison de " + a + " et " + b + " est :" + msg);
    }
    public static void afficherComparaisonString(String a, String b, int resultat) {
        String msg = resultat < 0 ? "\"" + a + "\" plus courte que \"" + b + "\"" :resultat > 0 ? "\"" + a + "\" plus longue que \"" + b + "\"" :"meme longueur";
        System.out.println("Resultat de comparaison de " + a + " et " + b + " est :" + msg);
    }
    public static void main(String[] args) {
        ComparateurInteger c = new ComparateurInteger();
        afficherComparaisonInt(10, 20, c.comparer(10, 20));
        ComparateurString q = new ComparateurString();
        afficherComparaisonString("hi", "hello",  q.comparer("hi", "hello"));
    }
}