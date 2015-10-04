import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.Cell;

/**
 *
 * @author vivi dimitris
 */
public class CellTest {

    public CellTest() {
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
    public void TestGetX() {
        Cell cell = new Cell("5", 1, 4);
        assertEquals("1", 1, cell.getX(), 0);
    }

    @Test
    public void TestGetY() {
        Cell cell = new Cell("5", 1, 4);
        assertEquals("4", 4, cell.getY(), 0);
    }

    @Test
    public void TestGetValue() {
        Cell cell = new Cell("5", 1, 4);
        assertEquals("5", "5", cell.getValue());
    }

    @Test
    public void TestSetX() {
        Cell cell = new Cell("5", 1, 4);
        cell.setX(3);
        assertEquals("3", 3, cell.getX(), 0);
    }

    @Test
    public void TestSetY() {
        Cell cell = new Cell("5", 1, 4);
        cell.setY(7);
        assertEquals("7", 7, cell.getY(), 0);
    }

    @Test
    public void TestSetValue() {
        Cell cell = new Cell("5");
        cell.setValue("6");
        assertEquals("6", "6", cell.getValue());
    }
}
