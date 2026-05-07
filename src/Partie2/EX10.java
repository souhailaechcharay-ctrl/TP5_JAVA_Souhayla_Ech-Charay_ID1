package Partie2;

public class EX10 {

    public static void expliquerChecked() {
        System.out.println("=== Quand utiliser CHECKED ? ===");
        System.out.println("- Erreurs prévisibles et récupérables venant de l'extérieur.");
        System.out.println("- Ex : fichier introuvable, connexion réseau, base de données.");
        System.out.println("- Le compilateur FORCE l'appelant à gérer (throws / try-catch).");
        System.out.println("- Hérite de Exception (mais pas de RuntimeException).");
    }

    public static void expliquerUnchecked() {
        System.out.println("\n=== Quand utiliser UNCHECKED ? ===");
        System.out.println("- Erreurs de programmation, arguments invalides, bugs.");
        System.out.println("- Ex : NullPointerException, IllegalArgumentException.");
        System.out.println("- Le compilateur NE force PAS la gestion.");
        System.out.println("- Hérite de RuntimeException.");
    }

    public static void expliquerPersonnalisee() {
        System.out.println("\n=== Pourquoi créer une exception personnalisée ? ===");
        System.out.println("- Pour donner un sens métier clair à l'erreur.");
        System.out.println("- Ex : SoldeInsuffisantException est plus explicite que Exception.");
        System.out.println("- Facilite la lecture, la maintenance et le débogage du code.");
    }

    public static void main(String[] args) {
        expliquerChecked();
        expliquerUnchecked();
        expliquerPersonnalisee();
    }
}