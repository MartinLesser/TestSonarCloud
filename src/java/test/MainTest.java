import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void increment_when_inputX_then_returnXPlusOne() {
        final Main main = new Main();
        final int increment = main.increment(5);
        assertEquals(6, increment);
    }
}