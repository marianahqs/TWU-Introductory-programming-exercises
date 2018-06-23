package diamondexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondNameTest {

    @Test
    void shouldReturnADiamondWhitSizeProvidedAndNameInCenter(){

        DiamondName diamondName = new DiamondName(1);

        String expected = "MARI";
        assertEquals(expected,diamondName.toString());


        diamondName = new DiamondName(2);

        expected = "*\nMARI\n*";
        assertEquals(expected,diamondName.toString());


        diamondName = new DiamondName(3);

        expected = " *\n***\nMARI\n***\n *";
        assertEquals(expected,diamondName.toString());

        diamondName = new DiamondName(4);

        expected = "  *\n ***\n*****\nMARI\n*****\n ***\n  *";
        assertEquals(expected,diamondName.toString());
    }
}
