public class Professeur extends MembreUniversite{
    private String specialite;
    private double salaire;

    public Professeur(String nom, int age, String specialite, double salaire){
        super(nom, age);
        this.specialite =specialite;
        this.salaire =salaire;
    }

    public void augmenterSalaire(double pourcentage){
        salaire +=salaire * (pourcentage / 100.0);
    }

    @Override
    public void afficherInformations(){
        System.out.printf("Professeur: %s, Age: %d, Spécialité: %s, Salaire: %.2f$%n",
                getNom(), getAge(), specialite, salaire);
    }

    @Override
    protected String tachesSpecifiques(){
        return getNom() + " prépare et enseigne des cours en " +specialite;
    }
}
