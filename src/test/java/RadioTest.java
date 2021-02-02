import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp() throws Exception {
        radio = new Radio();
    }

    @Test
    public void tune() {
        assertEquals("Tuned to Magic", radio.tune("Magic"));
    }
}