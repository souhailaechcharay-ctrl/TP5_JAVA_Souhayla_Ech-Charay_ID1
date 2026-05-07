package Partie2;

public class EX6 {

    static class StockInsuffisantException extends Exception {
        public StockInsuffisantException(int stock, int demande) {
            super("Stock insuffisant, Le stock disponible est " + stock + " et la stock demande est " + demande);
        }
    }
    static class Produit {
        private String nom;
        private int stock;

        public Produit(String nom, int stock) {
            this.nom = nom;
            this.stock = stock;
        }
        public void retirerDuStock(int quantite) throws StockInsuffisantException {
            if (quantite > stock) {
                throw new StockInsuffisantException(stock, quantite);
            }
            stock -= quantite;
            System.out.println("Retrait de " + quantite);
        }
    }
    public static void testerRetrait(Produit p, int quantite) {
        try {
            p.retirerDuStock(quantite);
        } catch (StockInsuffisantException e) {
            System.out.println("[StockInsuffisantException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Produit p = new Produit("Tablette", 10);
        testerRetrait(p, 4);
        testerRetrait(p, 3);
        testerRetrait(p, 20);
    }
}