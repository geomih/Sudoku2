
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.HypersudokuGame;
import sudoku2.PersonPlayer;
import sudoku2.Sudoku;
import sudoku2.SudokuGame;

/**
 *
 * @author vivi dimitris
 */
public class PersonPlayerTest {

    public PersonPlayerTest() {
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
    public void TestAddPlayedGames() {
        PersonPlayer player = new PersonPlayer("nick");
        SudokuGame sudo = new SudokuGame("3", 9);
        player.addPlayedGames(sudo);
    }

    @Test
    public void TestHasPlayedGamesTrue() {
        PersonPlayer player = new PersonPlayer("nick");
        SudokuGame sudo = new SudokuGame("3", 9);
        player.addPlayedGames(sudo);
        assertEquals("", true, player.hasPlayed(sudo));
    }

    @Test
    public void TestHasPlayedGamesFalse() {
        PersonPlayer player = new PersonPlayer("nick");
        SudokuGame sudo = new SudokuGame("3", 9);
        SudokuGame sudo2 = new SudokuGame("5", 9);
        player.addPlayedGames(sudo);
        assertEquals("", false, player.hasPlayed(sudo2));
    }

    @Test
    public void TestPlayedGames() {
        PersonPlayer player = new PersonPlayer("nick");
        SudokuGame sudo = new SudokuGame("3", 9);
        HypersudokuGame hyper2 = new HypersudokuGame("5", 9);
        player.addPlayedGames(sudo);
        player.addPlayedGames(hyper2);
        ArrayList<Sudoku> list = new ArrayList<>();
        list.add(sudo);
        list.add(hyper2);
        assertEquals("", list, player.getPlayedGames());
    }

    @Test
    public void TestSetAndGetPlayer() {
        PersonPlayer player = new PersonPlayer("nick");
        player.setNickname("paul");
        assertEquals("", "paul", player.getNickname());

    }

}
