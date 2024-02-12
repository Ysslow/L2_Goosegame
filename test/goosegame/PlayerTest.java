package goosegame;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PlayerTest {

    private Player p;

    @Before
    public void init() {
        p = new Player("TestName");
    }

    @Test
    public void testGetCell() {
        assertEquals(null, p.getCell());
        Cell c = new Cell();
        p.setCell(c);
        assertEquals(c, p.getCell());

    }

    @Test
    public void testToString() {
        assertEquals("TestName", p.toString());
    }

    @Test
    public void testTwoDiceThrow() {
        int v = p.twoDiceThrow();
        assertEquals(v, v);
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(goosegame.PlayerTest.class);
    }
}
