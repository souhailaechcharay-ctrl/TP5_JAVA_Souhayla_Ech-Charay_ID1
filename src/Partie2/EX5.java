package Partie2;

public class EX5 {

    static class AuthentificationException extends Exception {
        public AuthentificationException() {
            super("Identifiants incorrects");
        }
    }
    private static final String USER = "souhayla";
    private static final String PASS = "2005";

    public static void login(String username, String password)
            throws AuthentificationException {
        if (!USER.equals(username) || !PASS.equals(password)) {
            throw new AuthentificationException();
        }
        System.out.println("Connexion reussie pour : " + username);
    }
    public static void testerLogin(String username, String password) {
        try {
            login(username, password);
        } catch (AuthentificationException e) {
            System.out.println("[AuthentificationException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        testerLogin("souhayla", "2005");
        testerLogin("souhayla", "5278");
        testerLogin("yassine", "2005");
        testerLogin("wael", "2004");
    }
}