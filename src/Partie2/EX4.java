package Partie2;

public class EX4 {

    static class EmailInvalideException extends Exception {
        public EmailInvalideException(String email) {
            super("Email invalide : " + email);
        }
    }
    static class AgeInvalideException extends Exception {
        public AgeInvalideException(int age) {
            super("Age invalide : " + age);
        }
    }
    public static void inscrire(String email, int age)
            throws EmailInvalideException, AgeInvalideException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalideException(email);
        }
        if (age < 18) {
            throw new AgeInvalideException(age);
        }
        System.out.println("Inscription reussie : " + email + " age : " + age);
    }

    public static void testerInscription(String email, int age) {
        try {
            inscrire(email, age);
        } catch (EmailInvalideException e) {
            System.out.println("[EmailInvalideException] " + e.getMessage());
        } catch (AgeInvalideException e) {
            System.out.println("[AgeInvalideException] " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        testerInscription("souhayla@gmail.com", 25);
        testerInscription("khadija.com", 20);
        testerInscription("yassine@mail.com", 15);
        testerInscription("yahya", 10);
    }
}