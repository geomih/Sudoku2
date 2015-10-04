package sudoku2;

import java.util.ArrayList;

/**
 * interface για υλοποίηση της βοήθειας sudoku θα έχει ένα set απο νούμερα 1-9
 * και κάνει remove κάθε νούμερο που θα βρίσκει στο sector ti γραμμή ή τη
 * στήλη(checkUnique) hyper έλεγχος και για τα κουτιά που ανήκουν σε 2 sectors
 */
public interface Help {

    /**
     * βοήθεια για τον χρήστη
     */

    public ArrayList<String> help(Cell cell);

}
