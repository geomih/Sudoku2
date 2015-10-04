package sudoku2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Κλάση που ασχολείται με τη λογική του παιχνιδιού.
 */
public class Logic {

    /**
     * HashMap με τους χρήστες και τα παιχνίδια που έχει παίξει ο καθένας
     */
    private final String currentNickname;
    public ArrayList<PersonPlayer> users;
    public ArrayList<Sudoku> sudokugames;
    private PersonPlayer player1;

    /**
     * δημιουργία αντικειμένου Player
     */
    /**
     * constructor της κλάσης Logic
     *
     * @param currentNickname
     * @throws java.io.IOException
     */
    public Logic(String currentNickname) throws IOException {
        this.currentNickname = currentNickname;
        users = new ArrayList<>();
        sudokugames = new ArrayList<>();
        loadPlayer();
        if (!currentNickname.equals("null")) {
            player1 = new PersonPlayer(currentNickname);
        }
    }

    public ArrayList<PersonPlayer> getPlayers() {
        return users;
    }

    /**
     * Συνάρτηση που καλέιται για να φορτώσουν τα 10 sudoku και hypersudoku κατά
     * την εκκίνηση του παιχνιδιού.
     *
     * @throws IOException
     */
    public void loadGames() throws IOException {
        //prepei na ginei 10
        for (int i = 1; i < 3; i++) {
            SudokuGame sudo = new SudokuGame(Integer.toString(i), 9);// kai to idio kai gia to hyper

            sudo.loadGame("Sudoku" + Integer.toString(i) + ".txt");
            sudokugames.add(sudo);

        }
    }

    /**
     * Εικονική αλλαγή νούμερων με γράμματα , από πίσω θα τρέχουν τα
     * νούμερα(ίσως με enum)
     *
     * @param p
     */
    public void Wordoku(boolean p) {
        // TODO : to implement	
    }

    /**
     * Περιπτωση 1,έχουμε τον χρήστη στο hashmap και θέλουμε ενα arraylist με τα
     * sudoku που έχει παίξει, εδώ ανάλογα με το αν έχουμε sudokugame ή
     * hypersudoku ψάχνει αντίστοιχα
     *
     * @throws java.io.FileNotFoundException
     */
    private void loadPlayer() throws FileNotFoundException, IOException {
        try (BufferedReader reader2 = new BufferedReader(new FileReader("input.txt"));) {
            String line;

            while ((line = reader2.readLine()) != null) {
                String[] tokens;
                tokens = line.split(" ");
                String name = tokens[0];
                PersonPlayer temp = new PersonPlayer(name);
                users.add(temp);
                for (int i = 1; i < tokens.length; i++) {
                    String[] part2 = tokens[i].split("-");
                    for (int counter = 0; counter < part2.length; counter += 2) {
                        if (part2[counter + 1].equals("SudokuGame")) {
                            SudokuGame sudokugame = new SudokuGame(part2[counter], 9);
                            temp.addPlayedGames(sudokugame);
                        }

                        if (part2[counter + 1].equals("HyperSudoku")) {
                            HypersudokuGame hypersudokugame = new HypersudokuGame(part2[counter], 9);
                            temp.addPlayedGames(hypersudokugame);
                        }
                    }
                }
            }
        }
    }

    public void saveCurrentGame(String game, String id) {
        if (game.equals("Classic Sudoku") && (!currentNickname.equals("null"))) {
            player1.addPlayedGames(new SudokuGame(id, 9));
            //save gametype and id to hard drive
        } else if (game.equals("HyperSudoku") && (!currentNickname.equals("null"))) {
            player1.addPlayedGames(new HypersudokuGame(id, 9));
            //save gametype and id to hard drive
        } else {
            System.out.println("Game wasn't saved");
        }
    }

    public void savePlayer(Sudoku sudoku) throws IOException {

        if (!playerExists() && !player1.getNickname().equals("null")) {
            StringBuilder record = new StringBuilder();
            player1.addPlayedGames(sudoku);

            record.append(player1.getNickname()).append(" ");
            if (sudoku.type().equals("Classic Sudoku")) {
                record.append(sudoku.getId()).append("-").append("SudokuGame").append("-");
            } else {
                record.append(sudoku.getId()).append("-").append(sudoku.type()).append("-");
            }
            String record2 = record.toString();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt", true))) {
                writer.write(record2);

                writer.newLine();

            }
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));) {
                String line;
                int lin = 0;
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split(" ,\t");
                    String name = tokens[0];

                    if (name.equals(player1.getNickname())) {
                        lin = i;
                        //break;                         
                    }
                    i++;
                }
                FileWriter fw = new FileWriter("input.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                LineNumberReader lnr = new LineNumberReader(new FileReader("input.txt"));
                lnr.setLineNumber(lin);
                for (int j = 0; j < lnr.getLineNumber(); j++) {
                    bw.append("hi");
                }
            }
        }

    }

    /**
     * Check if currentplayer exists
     *
     * @return
     */
    public boolean playerExists() {
        for (PersonPlayer p : users) {
            if (p.getNickname().equals(currentNickname)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 1)ο παίχτης υπάρχει loadPlayer() καλουμε RandomSudokuadd
     * PlayedGames(ArrayList) 2)addPlayerHashMapκαλουμε RandomSudokuadd
     * PlayedGames savePlayer()3)καλουμε RandomSudoku
     *
     * @param nickname
     * @return
     */
    public PersonPlayer currentPlayer(String nickname) {
        for (PersonPlayer play : users) {
            if (play.getNickname().equals(nickname)) {
                return play;
            }
        }
        return new PersonPlayer("null");
    }

    /**
     * Get the saved games of a player
     *
     * @param type
     * @return
     */
    public String[] playerMenu(String type) {
        String[] games = new String[20];
        int i = 0;
        for (PersonPlayer p : users) {//set player1 if he already exists
            if (p.getNickname().equals(currentNickname)) {
                player1 = p;
            }
        }
        for (Sudoku sud : player1.getPlayedGames()) {
            if (sud.type().equals(type)) {
                games[i] = sud.getId();
                i++;
            }
        }
        return games;
    }

    /**
     * Δέχεται ArrayList από sudoku και επιστρέφει τυχαία ένα από αυτάαπο 1-10
     * για sudoku
     *
     * @param list
     * @return
     */
    public String randomSudoku(String type) {
        String[] playedGames = playerMenu(type);
        ArrayList<Integer> playedGamesList = new ArrayList<>();
        for (int i = 0; i <= playedGames.length; i++) {
            playedGamesList.add(Integer.parseInt(playedGames[i]));
        }
        Random generator = new Random(playedGamesList.size());
        int c = generator.nextInt();
        while (playedGamesList.contains(c)) {
            c = generator.nextInt();
        }
        return Integer.toString(c);
    }
}
