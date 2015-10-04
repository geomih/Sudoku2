package sudoku2;

import java.util.ArrayList;

public class DuidokuGame extends Sudoku {

    /**
     * Constructor
     */
    public DuidokuGame() {
        super("1", 4);
    }

    @Override
    public ArrayList<String> help(Cell cell) {
        boolean flag;
        boolean flag2;
        boolean flag3;

        ArrayList<String> help = new ArrayList<>();

        for (int i = 1; i <= getDimention(); i++) {
            cell.setValue(String.valueOf(i));

            flag = checkLine(cell);
            flag2 = checkSector(cell);
            flag3 = checkStili(cell);

            if ((flag) && (flag3) && (flag2)) {
                help.add(cell.getValue());
            }
        }
        return help;
    }

    @Override
    public String type() {
        return "Duidoku";
    }
}