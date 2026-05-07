package Partie2;

public class EX1 {
    static class SoldeInsuffisantException extends Exception {
        public SoldeInsuffisantException(double solde, double montant) {
            super("Solde insuffisant , votre solde est " + solde + " DH et le montant demande est " + montant + " DH");
        }
    }
    static class CompteBancaire {
        String code;
        double solde;

        public CompteBancaire(String code, double solde) {
            this.code = code;
            this.solde = solde;
        }

        public void retirer(double montant) throws SoldeInsuffisantException {
            if (montant > solde) {
                throw new SoldeInsuffisantException(solde, montant);
            }
            solde -= montant;
            System.out.println("Retrait de " + montant + " DH");
        }
        public void verser(double montant) {
            solde += montant;
            System.out.println("Versement de " + montant + " DH");
        }
        public double getSolde() {
            return solde;
        }
    }
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("C001", 1000.0);
        compte.verser(500);
        try {
            compte.retirer(200);
        } catch (SoldeInsuffisantException e) {
            System.out.println("[SoldeInsuffisantException] " + e.getMessage());
        }
        try {
            compte.retirer(2000);
        } catch (SoldeInsuffisantException e) {
            System.out.println("[SoldeInsuffisantException] " + e.getMessage());
        }
    }
}