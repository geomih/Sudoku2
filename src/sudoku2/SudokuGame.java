package sudoku2;

import java.util.ArrayList;

public class SudokuGame extends Sudoku {

    public SudokuGame(String id, int dimention) {
        super(id, dimention);
    }

    @Override
    public String type() {
        return "Classic Sudoku";
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

            if (flag == true && flag2 == true && flag3 == true) {
                help.add(cell.getValue());
            }
        }
        return help;
    }
}