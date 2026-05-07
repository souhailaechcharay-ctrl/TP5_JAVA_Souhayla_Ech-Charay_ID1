package Partie2;

public class EX8 {

    static class ChampObligatoireException extends Exception {
        public ChampObligatoireException(String champ) {
            super("Champ obligatoire manquant : " + champ);
        }
    }

    public static void validerFormulaire(String nom, String email)
            throws ChampObligatoireException {
        if (nom == null || nom.trim().isEmpty()) {
            throw new ChampObligatoireException("nom");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new ChampObligatoireException("email");
        }
        System.out.println("Formulaire valide : nom=" + nom + ", email=" + email);
    }
    public static void testerFormulaire(String nom, String email) {
        try {
            validerFormulaire(nom, email);
        } catch (ChampObligatoireException e) {
            System.out.println("[ChampObligatoireException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        testerFormulaire("souhayla", "souhayla@gmail.com");
        testerFormulaire("", "souhayla@gmail.com");
        testerFormulaire("souhayla", "");
        testerFormulaire(null, "souhayla@gmail.com");
    }
}