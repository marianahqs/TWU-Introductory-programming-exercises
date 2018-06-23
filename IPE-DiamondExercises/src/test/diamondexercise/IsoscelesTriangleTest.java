package diamondexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsoscelesTriangleTest {

    @Test
    void shouldReturnATriangleWithTheSizeProvided() {

        IsoscelesTriangle triangle = new IsoscelesTriangle(1);

        String expected = "*";
        assertEquals(expected,triangle.toString());


        triangle = new IsoscelesTriangle(2);

        expected = " *\n***";
        assertEquals(expected,triangle.toString() );


        triangle = new IsoscelesTriangle(3);

        expected = "  *\n ***\n*****";
        assertEquals(expected,triangle.toString());
    }

//    @Test
//    void shouldReturnAnUpsideDownTriangleWithTheSizeProvided(){
//
//        IsoscelesTriangle upsideDownTriangle = new IsoscelesTriangle(1);
//
//        String expected = "*";
//        assertEquals(expected,upsideDownTriangle.toString());
//
//
//        upsideDownTriangle = new IsoscelesTriangle(2);
//
//        expected = "***\n *";
//        assertEquals(expected,upsideDownTriangle.toString());
//
//
//        upsideDownTriangle = new IsoscelesTriangle(3);
//
//        expected = "*****\n ***\n  *";
//        assertEquals(expected,upsideDownTriangle.toString());
//
//    }



}