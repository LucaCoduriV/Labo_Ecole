import java.util.ArrayList;

public class Personne {
    private String nom;
    private String prenom;

    Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString(){
        return prenom + " " + nom;
    }
}
