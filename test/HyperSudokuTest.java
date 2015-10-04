import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.Cell;
import sudoku2.HypersudokuGame;

/**
 *
 * @author vivi dimitris
 */
public class HyperSudokuTest {

    public HyperSudokuTest() {
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
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("2", 0, 0);
        assertEquals(" 258 ", false, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliFalse() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("5", 0, 0);
        assertEquals(" 5 ", false, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndCheckLineTrue() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("1", 0, 0);
        assertEquals(" 258 ", true, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliTrue() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("6", 0, 0);
        assertEquals(" 5  ", true, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorTrue() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("1", 0, 0);
        sudoku.setSectors(3);
        assertEquals(" 2 5  ", true, sudoku.checkSector(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorFalse() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("2", 0, 0);
        sudoku.setSectors(3);
        assertEquals(" 2 5 ", false, sudoku.checkSector(temp));//dinoume to sector gia na deite giati 

    }

    @Test
    public void TestLoadBelongInSectorAndGetX() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("7", 4, 0);
        sudoku.setSectors(3);
        assertEquals("1", 1, sudoku.belongInSector(temp).getX());
    }

    @Test
    public void TestLoadBelongInSectorAndGetY() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("7", 4, 7);
        sudoku.setSectors(3);
        assertEquals("2", 2, sudoku.belongInSector(temp).getY());
    }

    @Test
    public void TestType() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        assertEquals("HyperSudoku", "HyperSudoku", sudoku.type());
    }

    @Test
    public void TestGetID() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        assertEquals("1", "1", sudoku.getId());
    }

    @Test
    public void TestGetDimention() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        assertEquals("9", 9, sudoku.getDimention());
    }

    @Test
    public void TestSave() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        sudoku.saveGame("hypergametest.txt");
    }

    @Test
    public void TestSetAreasAndCheckAreasFalse() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("9", 2, 2);
        sudoku.setExtraSectors();
        assertEquals("9  ", false, sudoku.checkAreas(temp));//dinoume to sector gia na deite giati 
    }

    @Test
    public void TestSetAreasAndCheckAreasTrue() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("4", 2, 2);
        sudoku.setExtraSectors();
        assertEquals("9  ", true, sudoku.checkAreas(temp));//dinoume to sector gia na deite giati 
    }

    @Test
    public void TesBelongInExtraSectorAndGetX() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("7", 2, 2);
        sudoku.setExtraSectors();
        assertEquals("1", 1, sudoku.belongInExtraSector(temp).getX());
    }

    @Test
    public void TestBelongInExtraSectorAndGetY() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("7", 2, 2);
        sudoku.setExtraSectors();
        assertEquals("2", 1, sudoku.belongInExtraSector(temp).getY());
    }

    @Test
    public void TestHelp() throws IOException {
        HypersudokuGame sudoku = new HypersudokuGame("1", 9);
        sudoku.loadGame("Hyper1.txt");
        Cell temp = new Cell("1", 2, 2);
        sudoku.setSectors(3);
        sudoku.setExtraSectors();
        ArrayList<String> list = new ArrayList<>();

        list.add("3");
        list.add("6");
        list.add("7");
        assertEquals("3,6,7", list, sudoku.help(temp));
    }

}
