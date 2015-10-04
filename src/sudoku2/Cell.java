package sudoku2;

import java.io.Serializable;

/*klasi pou prosomoiwnei to keli
 */
public class Cell implements Serializable {

    private String value;//i timi tou 
    private int xcell;// i suntetagmeni x
    private int ycell;// i suntetagmeni y
	/*construstor*/

    public Cell(String value, int x, int y) {
        this.value = value;
        this.xcell = x;
        this.ycell = y;
    }

    public Cell(String value) {
        this.value = value;

    }

    public void setValue(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public void setX(int xs) {
        xcell = xs;
    }

    public void setY(int ys) {
        ycell = ys;
    }

    public int getX() {
        return xcell;
    }

    public int getY() {
        return ycell;
    }

    @Override
    public String toString() {
        return value + " - " + xcell + " - " + ycell;
    }
}