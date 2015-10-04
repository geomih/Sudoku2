
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sudoku2.Logic;

/**
 *
 * @author vivi dimitris
 */
public class LogicTest {

    public LogicTest() {
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
    public void TestGetPlayers() throws IOException {
        Logic player1 = new Logic("nick");

        player1.getPlayers();
        player1.loadGames();

    }
}
