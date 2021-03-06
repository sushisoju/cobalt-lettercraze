package playerTest.Entity;

import java.io.File;

import junit.framework.TestCase;
import player.models.Puzzle;
import player.models.Theme;

public class testPuzzle extends TestCase {
	public void testInitializePuzzle() {
        File f = new File("../cobalt-lettercraze/testLevel/level1.txt");
        Puzzle p = new Puzzle(f);
        assertEquals(p.getMaxMoves(), 5);
        assertEquals(p.getThreshold()[0], 4);
        assertEquals(p.getThreshold()[1], 6);
        assertEquals(p.getThreshold()[2], 12);
        assertEquals(p.getIndex(), 1);
        assertEquals(p.getType(), "puzzle");
        p.updateLevel();
        p.initialize();
        assertTrue(p.endLevel());
        assertFalse(p.reset());
        assertTrue(p.undo());
    }
	
	public void testWriteToFile() {
        File read = new File("../cobalt-lettercraze/levels/level1.txt");
        Puzzle p = new Puzzle(read);
        p.printToFile();
	}
}
