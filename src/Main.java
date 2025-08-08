public class Main {
    public static void main(String[] args) {
        Universite u = new Universite();

        Professeur prof = new Professeur("Arhse", 45, "Informatique", 100000);
        Etudiant e1 = new Etudiant("Kartik", 21, "Génie Logiciel", 3.4);
        Etudiant e2 = new Etudiant("Mahmoud", 20, "Génie Civil", 3.8);

        u.ajouterMembre(prof);
        u.ajouterMembre(e1);
        u.ajouterMembre(e2);

        System.out.println("— Liste initiale —");
        u.afficherMembres();

        prof.augmenterSalaire(10);
        e1.mettreAJourMoyenne(3.7);

        System.out.println("— Après modifications —");
        u.afficherMembres();
    }
}
