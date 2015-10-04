package sudoku2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * uses Help
 */
public class Computer implements Help {

    private Sudoku sudoku;

    public Computer(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    /**
     * Χρησιμοποιεί την help και επιστρέφει τυχαία μία απο τις επιτρεπτές τιμές
     *
     * @param cell
     * @return
     */
    public Cell random(Cell cell) {

        ArrayList<String> help = help(cell);
        if (help.isEmpty()) {
            cell.setValue("10");
            return cell;
        }
        Collections.shuffle(help);

        cell.setValue(help.get(0));
        return cell;
    }

    /**
     * βοήθεια για τον χρήστη
     *
     * @param cell
     * @return
     */
    @Override
    public ArrayList<String> help(Cell cell) {
        boolean flag;
        boolean flag2;
        boolean flag3;

        ArrayList<String> help = new ArrayList<>();

        for (int i = 1; i <= sudoku.getDimention(); i++)//Duidoku dimntion=4
        {
            cell.setValue(String.valueOf(i));

            flag = sudoku.checkLine(cell);
            flag2 = sudoku.checkSector(cell);
            flag3 = sudoku.checkStili(cell);

            if (flag && flag3 && flag2) {
                help.add(cell.getValue());
            }
        }
        return help;
    }

}
