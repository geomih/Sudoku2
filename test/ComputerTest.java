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
public class ComputerTest {

    public ComputerTest() {
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

    public void TestRandom() throws IOException {
        DuidokuGame sudoku = new DuidokuGame();
        sudoku.loadGame("Dui.txt");
        Cell temp = new Cell("1", 1, 1);
        sudoku.setSectors(2);
    }

}
