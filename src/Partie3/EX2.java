package Partie3;

public class EX2 {

    static class Paire<T, U> {
        private T premier;
        private U second;

        public Paire(T premier, U second) {
            this.premier = premier;
            this.second  = second;
        }

        public T getPremier() { 
        	return premier; 
        }
        public U getSecond()  { 
        	return second;  
        }
        public void afficherPaire() {
            System.out.println("Paire : (" + premier + ", " + second + ")");
        }
    }
    public static void main(String[] args) {
        System.out.println("Paire<String, Integer>");
        Paire<String, Integer> p = new Paire<>("SOUHAYLA", 20);
        p.afficherPaire();
    }
}