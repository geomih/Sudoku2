package sudoku2;

import java.util.ArrayList;

public class PersonPlayer extends Player {

    /**
     * τα παιχνίδια που εχει ήδη παίξει ο παίκτης
     */
    private ArrayList<Sudoku> playedGames;

    /**
     * constructor της κλάσης PersonPlayer
     *
     * @param n
     */
    public PersonPlayer(String n) {
        super(n);
        playedGames = new ArrayList<>();
    }

    /**
     * μέθοδος για την προσθήκη sudoku στο ArrayList&nbsp;
     *
     * @param T
     * @return
     */
    public boolean hasPlayed(Sudoku T) {
        for (Sudoku play : playedGames) {
            if (play == T) {
                return true;
            }
        }
        return false;
    }

    public void addPlayedGames(Sudoku sud) {
        playedGames.add(sud);
    }

    public ArrayList<? extends Sudoku> getPlayedGames() {
        return playedGames;
    }
}