package sudoku2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Sudoku<T> implements Help {

    protected Cell[][] sudoku;
    private ArrayList<Sector> list;
    protected int dimention;
    private String id;

    public Sudoku(String id, int dimention) {
        this.id = id;
        this.dimention = dimention;
        sudoku = new Cell[dimention][dimention];
    }

    public abstract String type();

    public int getDimention() {
        return dimention;
    }

    public Cell[][] getSudokuBoard() {
        return sudoku;
    }

    public String getId() {
        return id;
    }

    /**
     * @param temp
     * @return
     */
    public boolean checkLine(Cell temp) {
        int x = temp.getX();
        for (int i = 0; i < getDimention(); i++) {
            if (sudoku[x][i].getValue().equals(temp.getValue()))//x=temp.getX()
            {
                return false;
            }
        }
        return true;
    }

    public boolean checkStili(Cell temp) {
        for (int i = 0; i < getDimention(); i++) {
            if (sudoku[i][temp.getY()].getValue().equals(temp.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkSector(Cell temp) {
        //if(belongInSector(temp).getList()==null){
        //System.out.println("belong sector returns null");
        //}

        ArrayList<String> templist = belongInSector(temp).getList();

        for (String item : templist) {
            if (item.equals(temp.getValue())) {
                return false;
            }
        }
        return true;
    }

    public Sector belongInSector(Cell cell) {
        int x = (int) (cell.getX() / Math.sqrt(dimention));
        int y = (int) (cell.getY() / Math.sqrt(dimention));

        for (Sector sec : list) {
            if ((x == sec.getX()) && (y == sec.getY())) {
                return sec;
            }
        }
        //System.out.println("null is coming");
        return null;
    }

    public void setSectors(int sdimention) {
        list = new ArrayList<>();
        for (int r = 0; r < sdimention * sdimention; r += sdimention) {
            for (int m = 0; m < sdimention * sdimention; m += sdimention) {
                Sector temp = new Sector((r + 1) / sdimention, (m + 1) / sdimention);

                for (int x = 0; x < sdimention; x++) {
                    for (int y = 0; y < sdimention; y++) {
                        temp.addToSector(sudoku[x + r][y + m].getValue());
                    }
                }
                list.add(temp);
            }
        }
    }

	//public ArrayList<Sector> getSectors(){
    //return list;
    //}
    public void loadGame(String file) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line;
            Cell[] cell = new Cell[getDimention() * getDimention() + 2];
            int i = 0;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                for (String token : tokens) {
                    cell[i] = new Cell(token);
                    ++i;
                }
            }

            int k = 0;
            for (int r = 0; r < getDimention(); r++) {
                for (int j = 0; j < getDimention(); j++) {
                    sudoku[r][j] = new Cell(cell[k].getValue(), r, j);
                    // System.out.print(sudoku[r][j].getValue());
                    ++k;
                }
                // System.out.println("");
            }
        }
    }

    public void printSudoku() {
        for (int r = 0; r < getDimention(); r++) {
            for (int j = 0; j < getDimention(); j++) {
                System.out.print(sudoku[r][j].getValue());
            }
            System.out.println("");
        }
    }

    public void saveGame(String filename) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < getDimention(); i++) {
                for (int j = 0; j < getDimention(); j++) {
                    String temp = sudoku[i][j].getValue();
                    writer.write(temp + ",");
                }
            }
        }
    }

    @Override
    public abstract ArrayList<String> help(Cell cell);
}