package interview150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowOfXAndNTest {

    private static final double DELTA = 1e-9;

    PowOfXAndN powOfXAndN = new PowOfXAndN();

    @Test
    public void testZeroExponent() {
        assertEquals(1.0, powOfXAndN.myPow(2.0, 0), DELTA);
        assertEquals(1.0, powOfXAndN.myPow(-5.0, 0), DELTA);
    }

    @Test
    public void testPositiveExponents() {
        assertEquals(8.0, powOfXAndN.myPow(2.0, 3), DELTA);
        assertEquals(16.0, powOfXAndN.myPow(2.0, 4), DELTA);
        assertEquals(9.0, powOfXAndN.myPow(3.0, 2), DELTA);
        assertEquals(7.0, powOfXAndN.myPow(7.0, 1), DELTA);
    }

    @Test
    public void testNegativeExponents() {
        assertEquals(0.25, powOfXAndN.myPow(2.0, -2), DELTA);
        assertEquals(0.125, powOfXAndN.myPow(2.0, -3), DELTA);
    }

    @Test
    public void testFractionalBase() {
        assertEquals(0.25, powOfXAndN.myPow(0.5, 2), DELTA);
        assertEquals(4.0, powOfXAndN.myPow(0.5, -2), DELTA);
    }

    @Test
    public void testOneAndNegativeOne() {
        assertEquals(1.0, powOfXAndN.myPow(1.0, 1000), DELTA);
        assertEquals(1.0, powOfXAndN.myPow(1.0, -1000), DELTA);
        assertEquals(1.0, powOfXAndN.myPow(-1.0, 0), DELTA);
        assertEquals(-1.0, powOfXAndN.myPow(-1.0, 1), DELTA);
        assertEquals(1.0, powOfXAndN.myPow(-1.0, 2), DELTA);
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0.0, powOfXAndN.myPow(0.0, 5), DELTA);
        assertEquals(0.0, powOfXAndN.myPow(2.0, Integer.MIN_VALUE));
    }

}
