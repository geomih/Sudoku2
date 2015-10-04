
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.Cell;
import sudoku2.DuidokuGame;

/**
 *
 * @author vivi dimitris
 */
public class DuidokuTest {

    public DuidokuTest() {
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
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("2", 0, 0);
        assertEquals(" 123 ", false, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliFalse() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("3", 0, 0);
        assertEquals(" 13  ", false, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndCheckLineTrue() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("4", 0, 0);
        assertEquals(" 123 ", true, sudoku.checkLine(temp));
    }

    @Test
    public void TestLoadAndCheckStiliTrue() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("2", 0, 0);
        assertEquals(" 3   ", true, sudoku.checkStili(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorTrue() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("3", 0, 0);
        sudoku.setSectors(2);
        assertEquals("12", true, sudoku.checkSector(temp));
    }

    @Test
    public void TestLoadAndSetSectorAndCheckSectorFalse() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("1", 0, 0);
        sudoku.setSectors(2);
        assertEquals(" 12  ", false, sudoku.checkSector(temp));//dinoume to sector gia na deite giati 

    }

    @Test
    public void TestLoadBelongInSectorAndGetX() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("1", 0, 0);
        sudoku.setSectors(2);
        assertEquals("1", 0, sudoku.belongInSector(temp).getX());
    }

    @Test
    public void TestLoadBelongInSectorAndGetY() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("7", 2, 3);
        sudoku.setSectors(2);
        assertEquals("2", 1, sudoku.belongInSector(temp).getY());
    }

    @Test
    public void TestType() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();

        assertEquals("Duidoku", "Duidoku", sudoku.type());
    }

    @Test
    public void TestGetID() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();

        assertEquals("1", "1", sudoku.getId());
    }

    @Test
    public void TestGetDimention() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();

        assertEquals("4", 4, sudoku.getDimention());
    }

    @Test
    public void TestSave() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        sudoku.saveGame("duigametest.txt");
    }

    @Test
    public void TestHelp() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("1", 1, 1);
        sudoku.setSectors(2);
        ArrayList<String> list = new ArrayList<>();
        list.add("3");
        list.add("4");
        assertEquals("4", list, sudoku.help(temp));
    }

}
