package Partie2;

public class EX2 {

    static class MontantInvalideException extends Exception {
        public MontantInvalideException(double montant) {
            super("Montant invalide : " + montant);
        }
    }
    static class CompteBancaire {
        String code;
        double solde;

        public CompteBancaire(String code, double solde) {
            this.code = code;
            this.solde = solde;
        }
        public void retirer(double montant) throws MontantInvalideException {
            if (montant <= 0) {
                throw new MontantInvalideException(montant);
            }
            solde -= montant;
            System.out.println("Retrait de " + montant + " DH");
        }
        public void verser(double montant) throws MontantInvalideException {
            if (montant <= 0) {
                throw new MontantInvalideException(montant);
            }
            solde += montant;
            System.out.println("Versement de " + montant + " DH. Solde : " + solde + " DH");
        }
    }
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("C002", 500.0);
        try {
            compte.verser(200);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        }
        try {
            compte.verser(2000);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        }
        try {
            compte.verser(-50);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        }
        try {
            compte.retirer(100);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        }
        try {
            compte.retirer(0);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        }
    }
}