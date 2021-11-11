public class Etudiant extends Personne {
    private int matricule;

    Etudiant(String nom, String prenom){
        super(nom, prenom);
    }


    @Override
    public String toString(){
        return "Etud. " + super.toString() + "(#" + matricule + ")";
    }
}
