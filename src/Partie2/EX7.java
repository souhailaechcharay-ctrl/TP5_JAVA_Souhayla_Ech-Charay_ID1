package Partie2;

public class EX7 {

    static class QuotaDepasseException extends Exception {
        public QuotaDepasseException(double taille, double limite) {
            super("Quota depasse , La taille est " + taille + " Mo et limite est " + limite + " Mo");
        }
    }
    private static final double LIMITE = 100.0;
    public static void telechargerFichier(double taille) throws QuotaDepasseException {
        if (taille > LIMITE) {
            throw new QuotaDepasseException(taille, LIMITE);
        }
        System.out.println("Telechargement de " + taille + " Mo");
    }
    public static void testerTelechargement(double taille) {
        try {
            telechargerFichier(taille);
        } catch (QuotaDepasseException e) {
            System.out.println("[QuotaDepasseException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        testerTelechargement(50.0);
        testerTelechargement(100.0);
        testerTelechargement(150.0);
    }
}
