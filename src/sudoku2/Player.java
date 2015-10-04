package sudoku2;

/**
 * Abstract class, υπάρχει απλά για την περίπτωση επέκτασης που θέλουμε να
 * επιλύει το computerplayer αυτόματα προβλήματα
 */
public abstract class Player {

    private String nickname;

	//public Player(){
    //}
    public Player(String n) {
        nickname = n;
    }

    /**
     * αλλάζει το nickname
     *
     * @param n
     */
    public void setNickname(String n) {
        nickname = n;
    }

    /**
     * μας επιστρέφει το nickname
     *
     * @return
     */
    public String getNickname() {
        return nickname;
    }
}