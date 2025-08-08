public class Etudiant extends MembreUniversite {
    private String programme;
    private double moyenne;

    public Etudiant(String nom, int age, String programme, double moyenne){
        super(nom, age);
        this.programme =programme;
        this.moyenne =moyenne;
    }

    public void mettreAJourMoyenne(double nouvelleMoyenne){
        this.moyenne =nouvelleMoyenne;
    }

    @Override
    public void afficherInformations(){
        System.out.printf("Étudiant: %s, Age: %d, Programme: %s, Moyenne: %.2f%n",
                getNom(), getAge(), programme, moyenne);
    }

    @Override
    protected String tachesSpecifiques(){
        return getNom() +" suit les cours du programme " +programme;
    }
}
