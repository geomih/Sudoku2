/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sudoku2.Sector;

/**
 *
 * @author vivi dimitris
 */
public class SectorTest {
    
    public SectorTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestSetX() {
     Sector sector=new Sector(1,4);
     sector.setX(3);
     assertEquals("3",3,sector.getX(),0);
     }
       @Test
     public void TestSetY() {
     Sector sector=new Sector(1,4);
     sector.setY(3);
     assertEquals("3",3,sector.getY(),0);
     }
       @Test
     public void TestGetY() {
     Sector sector=new Sector(1,4);
     assertEquals("4",4,sector.getY(),0);
     }
       @Test
     public void TestGetX() {
     Sector sector=new Sector(1,4);
     assertEquals("1",1,sector.getX(),0);
     }
        @Test
     public void TestAddtoSector() {
     Sector sector=new Sector(1,4);
     assertEquals("true",true,sector.addToSector("7"));
     }
        @Test
     public void TestCheckUniqueTrue(){
        Sector sector=new Sector(1,4);
        sector.addToSector("7");
        assertEquals("true",true,sector.checkUnique("7"));  
     }
        @Test
     public void TestCheckUniqueFalse(){
        Sector sector=new Sector(1,4);
        assertEquals("false",false,sector.checkUnique("9"));  
     }
         
       
}