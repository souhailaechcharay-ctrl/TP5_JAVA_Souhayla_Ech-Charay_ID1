package Partie2;

public class EX9 {

    static class PaiementRefuseException extends Exception {
        public PaiementRefuseException(double montant, double plafond) {
            super("Paiement refuse : Le montant " + montant + " DH > plafond " + plafond + " DH");
        }
    }
    static class CarteExpireeException extends Exception {
        public CarteExpireeException() {
            super("Paiement refuse : la carte bancaire est expiree");
        }
    }
    static class Paiement {
        private static final double PLAFOND = 5000.0;
        private boolean carteExpiree;

        public Paiement(boolean carteExpiree) {
            this.carteExpiree = carteExpiree;
        }
        public void payer(double montant) throws PaiementRefuseException, CarteExpireeException {
            if (carteExpiree) {
                throw new CarteExpireeException();
            }
            if (montant > PLAFOND) {
                throw new PaiementRefuseException(montant, PLAFOND);
            }
            System.out.println("Paiement de " + montant + " DH accepte");
        }
    }
    public static void testerPaiement(Paiement p, double montant) {
        try {
            p.payer(montant);
        } catch (CarteExpireeException e) {
            System.out.println("[CarteExpireeException] " + e.getMessage());
        } catch (PaiementRefuseException e) {
            System.out.println("[PaiementRefuseException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Paiement pValide = new Paiement(false);
        Paiement pExpire = new Paiement(true);
        testerPaiement(pValide, 1000);
        testerPaiement(pValide, 6000);
        testerPaiement(pExpire, 500);
    }
}