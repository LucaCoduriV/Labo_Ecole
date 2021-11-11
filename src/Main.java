public class Main {
    public static void main(String[] args) {



        Professeur DRE = new Professeur("Rossier", "Daniel", "DRE", null);
        Professeur PDO = new Professeur("Donini", "Pier", "PDO", null);

        Lecon POO = new Lecon("POO", 0, 2, 2, "S02", DRE);
        Lecon SYE = new Lecon("SYE", 1, 3, 2, "S02", DRE);
        Lecon TIC = new Lecon("TIC", 2, 4, 2, "S02", DRE);

        Lecon[] lecon1 = {POO, SYE};
        Lecon[] lecon2 = {TIC};

        Etudiant john = new Etudiant("Lennon", "John");
        Etudiant paul = new Etudiant("Mc Cartney", "Paul");
        Etudiant ringo = new Etudiant("Starr", "Ringo");
        Etudiant george = new Etudiant("Harisson", "George");
        Etudiant roger = new Etudiant("Waters", "Roger");
        Etudiant david = new Etudiant("Gilmour", "David");


        Lecon.horaire(lecon1);
    }
}
