package interview150.math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtOfXTest {

    SqrtOfX sqrtOfX = new SqrtOfX();
    @Test
    void testPerfectSquare(){
        int x = 4;
        assertEquals(2, sqrtOfX.mySqrt(x));
    }

    @Test
    void testZero(){
        int x = 0;
        assertEquals(0, sqrtOfX.mySqrt(x));
    }

    @Test
    void testOne(){
        int x = 1;
        assertEquals(1, sqrtOfX.mySqrt(x));
    }

    @Test
    void testFive(){
        int x = 5;
        assertEquals(2, sqrtOfX.mySqrt(x));
    }

    @Test
    void testLargerInteger(){
        int x = 2147483647;
        assertEquals(46340, sqrtOfX.mySqrt(x));
    }



}
