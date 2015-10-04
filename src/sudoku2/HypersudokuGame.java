package sudoku2;

import java.util.ArrayList;

public class HypersudokuGame extends Sudoku {

    private Sector sector1 = new Sector(1, 1);
    private Sector sector2 = new Sector(5, 1);
    private Sector sector3 = new Sector(1, 5);
    private Sector sector4 = new Sector(5, 5);

    public HypersudokuGame(String id, int dimention) {
        super(id, dimention);
    }

    @Override
    public String type() {
        return "HyperSudoku";
    }

    public boolean checkAreas(Cell temp) {
        if (belongInExtraSector(temp) != null) {
            ArrayList<String> templist1 = belongInExtraSector(temp).getList();
            for (String item : templist1) {
                if (item.equals(temp.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    public Sector belongInExtraSector(Cell cell) {

        if (cell.getX() > 0 && cell.getX() < 4 && cell.getY() > 0 && cell.getY() < 4) {
            return sector1;
        }

        if (cell.getX() > 4 && cell.getX() < 8 && cell.getY() > 0 && cell.getY() < 4) {
            return sector2;
        }

        if (cell.getX() > 0 && cell.getX() < 4 && cell.getY() > 4 && cell.getY() < 8) {
            return sector3;
        }

        if (cell.getX() > 4 && cell.getX() < 8 && cell.getY() > 4 && cell.getY() < 8) {
            return sector4;
        }

        return null;
    }

    public void setExtraSectors() {
        ArrayList<Sector> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(dimention); i++) {
            for (int j = 1; j <= Math.sqrt(dimention); j++) {
                sector1.addToSector(sudoku[i][j].getValue());
            }

        }

        for (int i = (int) ((2 * Math.sqrt(dimention)) - 1); i < (dimention - 1); i++) {
            for (int j = 1; j < Math.sqrt(dimention); j++) {
                sector2.addToSector(sudoku[i][j].getValue());
            }

        }

        for (int i = 1; i < Math.sqrt(dimention); i++) {
            for (int j = (int) ((2 * Math.sqrt(dimention)) - 1); j < (dimention - 1); j++) {
                sector3.addToSector(sudoku[i][j].getValue());
            }

        }

        for (int i = (int) ((2 * Math.sqrt(dimention)) - 1); i < (dimention - 1); i++) {
            for (int j = (int) ((2 * Math.sqrt(dimention)) - 1); j < (dimention - 1); j++) {
                sector4.addToSector(sudoku[i][j].getValue());
            }

        }
        list.add(sector1);
        list.add(sector2);
        list.add(sector3);
        list.add(sector4);

    }

    @Override
    public ArrayList<String> help(Cell cell) {
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag4;

        ArrayList<String> help = new ArrayList<>();

        for (int i = 1; i <= getDimention(); i++) {
            cell.setValue(String.valueOf(i));

            flag = checkLine(cell);
            flag2 = checkSector(cell);
            flag3 = checkStili(cell);
            flag4 = checkAreas(cell);

            if (flag == true && flag2 == true && flag3 == true && flag4 == true) {
                help.add(cell.getValue());
            }
        }
        return help;
    }
}
