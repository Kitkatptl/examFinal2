public abstract class MembreUniversite implements Personne {
    private String nom;
    private int age;

    public MembreUniversite(String nom, int age) {
        this.nom =nom;
        this.age =age;
    }


    protected String getNom(){
        return nom;
    }
    protected int getAge(){
        return age;
    }
    protected void setNom(String nom){
        this.nom =nom;
    }
    protected void setAge(int age){
        this.age =age;
    }


    protected abstract String tachesSpecifiques();

    public void afficherTaches() {
        System.out.println(getNom() +" : " + tachesSpecifiques());
    }
}
