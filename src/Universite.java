import java.util.ArrayList;
import java.util.List;

public class Universite{
    private final List<Personne> membres = new ArrayList<>();

    public void ajouterMembre(Personne p){
        if (p != null) membres.add(p);
    }

    public void afficherMembres() {
        for (int i = 0; i < membres.size(); i++) {
            Personne p = membres.get(i);
            p.afficherInformations();
            if (p instanceof MembreUniversite mu) {
                mu.afficherTaches();
            }
        }
    }

}
