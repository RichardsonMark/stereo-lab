import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Mp3PlayerTest {

    Mp3Player mp3Player;
    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CdPlayer cdPlayer;


    @Before
    public void setUp() throws Exception {
        mp3Player = new Mp3Player("Sony", "Walkman");
        radio = new Radio();
        cdPlayer = new CdPlayer("Sony", "Discman", 5);
        recordDeck = new RecordDeck("Technics", "Tabletop", 45);
        stereo = new Stereo("Mark + Iain's stereo", radio, recordDeck, cdPlayer);
    }

    @Test
    public void getMake() {
        assertEquals("Sony", mp3Player.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Walkman", mp3Player.getModel());
    }

    @Test
    public void connect() {
        String connected = mp3Player.connect(stereo);
        assertEquals("Mp3 Player is connected to Mark + Iain's stereo", connected);

    }
}