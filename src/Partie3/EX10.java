package Partie3;

public class EX10 {

    static class User {
        String nom;
        public User(String nom) { 
        	this.nom = nom; 
        }
        public String toString() {
            return "User(" + nom + ")";
        }
    }
    static class Repository<T> {
        public void save(T obj) {
            System.out.println("Sauvegarde : " + obj);
        }
    }
    static class UserRepository extends Repository<User> {
        public void sauvegarderUtilisateur(User nom) {
            save(nom);
        }
    }
    public static void main(String[] args) {
    	Repository<String> repo = new Repository<>();
        repo.save("Objet generique");
        UserRepository re = new UserRepository();
        User p = new User("Souhayla");
        re.sauvegarderUtilisateur(p);
    }
}