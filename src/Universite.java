import java.util.ArrayList;
import java.util.List;

public class Universite {
    private final List<Personne> membres = new ArrayList<>();

    public void ajouterMembre(Personne p) {
        if (p != null) membres.add(p);
    }

    public void afficherMembres() {
        for (Personne p : membres) {
            p.afficherInformations();
            if (p instanceof MembreUniversite mu) {
                mu.afficherTaches();
            }
        }
    }
}
