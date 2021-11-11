import java.util.ArrayList;

public class Professeur extends Personne {
    private String abreviation;
    private Lecon[] lecons;

    Professeur(String nom, String prenom, String abreviation, Lecon[] lecons){
        super(nom, prenom);
        this.abreviation = abreviation;
        this.lecons = lecons;
    }

    public String getAbreviation() {
        return abreviation;
    }

    String horaire(){
        // TODO
        return "";
    }

    @Override
    public String toString() {
        return "Prof. " + super.toString() + "(" + abreviation + ")";
    }
}
