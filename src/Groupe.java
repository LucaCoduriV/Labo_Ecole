import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Groupe {
    int no;
    String orientation;
    int trimestre;
    Etudiant[] etudiants;
    Lecon[] lecons;

    String nom() {
        return orientation + "-" + no;
    }

    int nombreEtudiants() {
        return etudiants.length;
    }
    void definirLecons(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    String getSepRow(String colFormat, String colHourFormat, int nbCols) {
        String sepRow = "";
        sepRow += String.format(colHourFormat, "");
        for (int i = 0; i < nbCols; ++i) {
            sepRow += String.format(colFormat, "----------");
        }

        return sepRow + "\n";
    }

    String horaire() {
        return Lecon.horaire(lecons);

//        String[] joursSemaine = {"Lun", "Mar", "Mer", "Jeu", "Ven"};
//        int sizeCol = 10;
//        int sizeColHours = 5;
//        String colHour = "%5s|";
//        String col = "%10s|";
//        String sep = "----------";
//
//        String result = "-- Horaire du groupe " + nom() + " (" + nombreEtudiants() + " etudiants"
//                + ")\n";
//
//        // Afficher jour semaine
//        result += String.format(colHour, "");
//        for (int i = 0; i < joursSemaine.length; ++i) {
//            result += String.format(col, joursSemaine[i]);
//        }
//
//        result += String.format("\n" + colHour, "");
//        for (int i = 0; i < joursSemaine.length; ++i) {
//
//        }

    }
}
