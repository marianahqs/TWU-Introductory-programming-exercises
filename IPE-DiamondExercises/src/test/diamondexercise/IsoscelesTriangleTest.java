package diamondexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsoscelesTriangleTest {

    @Test
    void shouldReturnATriangleWithTheSizeProvided() {

        IsoscelesTriangle triangle = new IsoscelesTriangle(1,false,0);

        String expected = "*";
        assertEquals(expected,triangle.toString());


        triangle = new IsoscelesTriangle(2,false,0);

        expected = " *\n***";
        assertEquals(expected,triangle.toString() );


        triangle = new IsoscelesTriangle(3,false,0);

        expected = "  *\n ***\n*****";
        assertEquals(expected,triangle.toString());
    }

    @Test
    void shouldReturnAnUpsideDownTriangleWithTheSizeProvided(){

        IsoscelesTriangle upsideDownTriangle = new IsoscelesTriangle(1,true,0);

        String expected = "*";
        assertEquals(expected,upsideDownTriangle.toString());


        upsideDownTriangle = new IsoscelesTriangle(2, true,0);

        expected = "***\n *";
        assertEquals(expected,upsideDownTriangle.toString());


        upsideDownTriangle = new IsoscelesTriangle(3, true,0);

        expected = "*****\n ***\n  *";
        assertEquals(expected,upsideDownTriangle.toString());

    }

    @Test
    void shouldReturnADiamondWhitCenterPositionProvided(){

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