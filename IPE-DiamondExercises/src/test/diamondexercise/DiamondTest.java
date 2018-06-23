package diamondexercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiamondTest {

    @Test
    void shouldReturnADiamondWhitSizeProvided(){

        Diamond diamond = new Diamond(1);

        String expected = "*";
        assertEquals(expected,diamond.toString());


        diamond = new Diamond(2);

        expected = " *\n***\n *";
        assertEquals(expected,diamond.toString());


        diamond = new Diamond(3);

        expected = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected,diamond.toString());
    }
}
