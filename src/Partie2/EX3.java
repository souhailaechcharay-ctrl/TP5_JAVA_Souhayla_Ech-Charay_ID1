package Partie2;

public class EX3 {

    static class SoldeInsuffisantException extends Exception {
        public SoldeInsuffisantException(double solde, double montant) {
            super("Solde insuffisant , votre solde est " + solde + " DH et le montant demande est " + montant + " DH");
        }
    }
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
        public void retirer(double montant) throws MontantInvalideException, SoldeInsuffisantException {
            if (montant <= 0) {
                throw new MontantInvalideException(montant);
            }
            if (montant > solde) {
                throw new SoldeInsuffisantException(solde, montant);
            }
            solde -= montant;
            System.out.println("Retrait de " + montant + " DH. Nouveau solde : " + solde + " DH");
        }
    }
    public static void testerRetrait(CompteBancaire c, double montant) {
        try {
            c.retirer(montant);
        } catch (MontantInvalideException e) {
            System.out.println("[MontantInvalideException] " + e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("[SoldeInsuffisantException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("C003", 800.0);
        testerRetrait(compte, 300);
        testerRetrait(compte, -100);
        testerRetrait(compte, 0);
        testerRetrait(compte, 1000);
    }
}