package Partie3;

public class EX1 {

    static class Boite<T> {
        private T contenu;

        public void setContenu(T contenu) {
        	this.contenu = contenu; 
        }
        public T getContenu() { 
        	return contenu;
        }
    }
    public static void main(String[] args) {
        System.out.println("Boite<String>");
        Boite<String> boite = new Boite<>();
        boite.setContenu("Bonjour");
        System.out.println("Contenu : " + boite.getContenu());
        System.out.println("Boite<Integer>");
        Boite<Integer> boit = new Boite<>();
        boit.setContenu(30);
        System.out.println("Contenu : " + boit.getContenu());
    }
}