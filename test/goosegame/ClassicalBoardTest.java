package goosegame;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClassicalBoardTest {

    private ClassicalBoard b;

    @Before
    public void init() {
        b = new ClassicalBoard();
    }

    @Test
    public void getNbOfCellsTest() {
        assertEquals(64, b.nbOfCells);
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(goosegame.ClassicalBoardTest.class);
    }
}
