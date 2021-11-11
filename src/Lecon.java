public class Lecon {
    private String matiere;
    private int jourSemaine;
    private int periodeDebut;
    private int duree;
    private String salle;
    private Professeur professeur;

    private final static String SEP_HOR = "---------------";
    private final static String SEP_VER = "|";

    private final static String[] PERIODES = {"8:30", "9:15", "10:25", "11h15", "12:00", "13:15", "14:00", "14:55", "15:55", "16:35", "17:20"};
    private final static String[] JOURS = {"Lun", "Mar", "Mer", "Jeu", "Ven", "Sam", "Dim"};

    Lecon(String matiere, int jourSemaine, int periodeDebut, int duree, String salle, Professeur professeur){
        this.matiere = matiere;
        this.jourSemaine = jourSemaine;
        this.periodeDebut = periodeDebut;
        this.duree = duree;
        this.salle = salle;
        this.professeur = professeur;
    }
    Lecon(String matiere){
        this.matiere = matiere;
    }

    private String getLigneJoursSemaine(String colHourFormat, String colFormat) {
        String[] joursSemaine = {"Lun", "Mar", "Mer", "Jeu", "Ven"};
        String ligne = String.format(colFormat, "");

        for (int i = 0; i < joursSemaine.length; ++i) {
            ligne += String.format(colFormat, joursSemaine[i]);
        }

        return ligne + "\n";
    }

    @Override
    public String toString(){
        return matiere + " " + salle + " " + professeur.getAbreviation();
    }

    static String horaire(Lecon[] lecons){

        final int HOUR_SIZE = 5;
        final int SIZE = 13;


        for(int i = 0; i <= PERIODES.length * 2; ++i){

            if (i == 0 || i % 2 != 0)
                printCaseTab("", HOUR_SIZE);
            else
                printCaseTab(PERIODES[(i-2) / 2], HOUR_SIZE);

            for(int j = 0; j < JOURS.length; ++j){

                if(i == 0){
                    if(j > 0){
                        printCaseTab(JOURS[j-1], SIZE);
                    }else{
                        printCaseTab("", HOUR_SIZE);
                    }
                } else {
                    if (i % 2 != 0) {
                        // afficher sép
                    } else {
                        Lecon currentLecon = getLeconAt((i-2) / 2, lecons);

                        if(currentLecon != null && currentLecon.periodeDebut == (i - 2) / 2 && currentLecon.jourSemaine == j){
                            printCaseTab(currentLecon.toString(), SIZE);
                        }
                    }
                }

            }
            System.out.print("\n");
        }


        return "";
    }

    public int[] getPeriodes(){
        int[] periodes = new int[this.duree];

        for(int i = 0; i < this.duree; i++){
            periodes[i] = i + this.periodeDebut;
        }

        return periodes;
    }

    private static Lecon getLeconAt(int periode, Lecon[] lecons){

        for (Lecon lecon: lecons) {
            for(int i: lecon.getPeriodes()){
                if(periode == i) return lecon;
            }
        }

        return null;
    }

    private static void printCaseTab(String content, int size){
        //String test = "%"+size+"s%c";
        //String.format(test, content, SEP_VER);
        System.out.printf(content);
    }

}
