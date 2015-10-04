
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.Cell;
import sudoku2.SudokuGame;

/**
 *
 * @author vivi dimitris
 */
public class SudokuGameTest {

    public SudokuGameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestLoadAndCheckLineFalse() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("7", 0, 0);
        assertEquals(" 293 4 7 ", false, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliFalse() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("7", 0, 0);
        assertEquals(" 472    ", false, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndCheckLineTrue() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("1", 0, 0);
        assertEquals(" 293 4 7 ", true, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliTrue() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("5", 0, 0);
        assertEquals(" 472    ", true, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorTrue() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("1", 0, 0);
        sudoku.setSectors(3);
        assertEquals(" 294 87  ", true, sudoku.checkSector(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorFalse() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("7", 0, 0);
        sudoku.setSectors(3);
        assertEquals(" 294 87  ", false, sudoku.checkSector(temp)); 

    }

    @Test
    public void TestLoadBelongInSectorAndGetX() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("7", 4, 0);
        sudoku.setSectors(3);
        assertEquals("1", 1, sudoku.belongInSector(temp).getX());
    }

    @Test
    public void TestLoadBelongInSectorAndGetY() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("7", 4, 7);
        sudoku.setSectors(3);
        assertEquals("2", 2, sudoku.belongInSector(temp).getY());
    }

    @Test
    public void TestType() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        assertEquals("Classic Sudoku", "Classic Sudoku", sudoku.type());
    }

    @Test
    public void TestGetID() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        assertEquals("1", "1", sudoku.getId());
    }

    @Test
    public void TestGetDimention() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        assertEquals("9", 9, sudoku.getDimention());
    }

    @Test
    public void TestSave() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        sudoku.saveGame("sudokugametest.txt");
    }

    @Test
    public void TestHelp() throws IOException {
        SudokuGame sudoku = new SudokuGame("1", 9);
        sudoku.loadGame("Sudoku1.txt");
        Cell temp = new Cell("1", 0, 0);
        sudoku.setSectors(3);
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("5");
        list.add("6");
        assertEquals("1,5,6", list, sudoku.help(temp));
    }
}