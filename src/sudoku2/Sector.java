package sudoku2;

import java.util.ArrayList;

public class Sector {

    ArrayList<String> sector;

    protected int sdimention;
    private int xsector;
    private int ysector;

	//public String attribute;
    public Sector(int x, int y) {
        this.xsector = x;
        this.ysector = y;
        sector = new ArrayList<>();
    }

    //mporei na mpei apeuthias sti addToSector
    public boolean checkUnique(String value) {

        if (sector.contains(value)) {
            return true;
        } else {
            return false;
        }

    }
    /*
     * prosthetei ena cell sto sector elegxwntas an mporei na mpei ekei
     * nomizw den mporei na mpei edw dioti tha prepei na ginoun kai oi alloi elegxoi
     * remember to check it
     */

    public boolean addToSector(String value) {

        if (checkUnique(value)) {
            return false;
        } else {
            sector.add(value);
            return true;
        }
    }

    public void setX(int x) {
        this.xsector = x;
    }

    public void setY(int y) {
        this.ysector = y;
    }

    public int getX() {
        return xsector;
    }

    public int getY() {
        return ysector;
    }

    public ArrayList<String> getList() {
        return sector;
    }
}