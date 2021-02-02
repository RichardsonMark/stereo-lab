import org.junit.Before;

import static org.junit.Assert.*;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void setUp() throws Exception {
        cdPlayer = new CdPlayer("Sony", "Discman", 5);
    }

    @org.junit.Test
    public void getMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @org.junit.Test
    public void getModel() {
        assertEquals("Discman", cdPlayer.getModel());
    }

    @org.junit.Test
    public void play() {
        assertEquals("Celine Dion is playing!", cdPlayer.play("Celine Dion"));
    }

    @org.junit.Test
    public void getNumberOfCds() {
        assertEquals(5, cdPlayer.getNumberOfCds());
    }

}