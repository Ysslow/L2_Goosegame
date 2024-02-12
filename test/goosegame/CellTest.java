package goosegame;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CellTest {

    private Cell c;

    @Before
    public void initialisation() {
        this.c = new Cell();
        c.setIndex(1);
    }

    @Test
    public void getPTest() {
        assertEquals(null, this.c.getPlayer());
    }

    @Test
    public void setPTest() {
        this.c.setPlayer(new Player("test"));
        assertEquals(new Player("test"), this.c.getPlayer());
    }

    @Test
    public void getIndexTest() {
        assertEquals(1, this.c.getIndex());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(true, this.c.isEmpty());
        this.c.setPlayer(new Player("test"));
        assertEquals(false, this.c.isEmpty());
    }

    @Test
    public void canMoveTest() {
        assertEquals(true, this.c.canEscape());
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(goosegame.CellTest.class);
    }
}
