import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp() throws Exception {
        recordDeck = new RecordDeck("Technics", "Tabletop", 45);
    }

    @Test
    public void getMake() {
        assertEquals("Technics", recordDeck.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Tabletop", recordDeck.getModel());
    }

    @Test
    public void play() {
        assertEquals("A record is playing!", recordDeck.play("A record"));
    }

    @Test
    public void getPlaySpeed() {
        assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void setPlaySpeed() {
        recordDeck.setPlaySpeed(38);
        assertEquals(38, recordDeck.getPlaySpeed());
    }
}