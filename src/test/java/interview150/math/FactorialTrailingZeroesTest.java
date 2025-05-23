package interview150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTrailingZeroesTest {

    FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();

    @Test
    public void testZero() {
        assertEquals(0, factorialTrailingZeroes.trailingZeroes(0));
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(0, factorialTrailingZeroes.trailingZeroes(1));
        assertEquals(0, factorialTrailingZeroes.trailingZeroes(4));
        assertEquals(1, factorialTrailingZeroes.trailingZeroes(5));
    }

    @Test
    public void testMediumNumbers() {
        assertEquals(2, factorialTrailingZeroes.trailingZeroes(10));
        assertEquals(6, factorialTrailingZeroes.trailingZeroes(25));
        assertEquals(12, factorialTrailingZeroes.trailingZeroes(50));
    }

    @Test
    public void testLargerNumbers() {
        assertEquals(24, factorialTrailingZeroes.trailingZeroes(100));
        assertEquals(31, factorialTrailingZeroes.trailingZeroes(125));
        assertEquals(49, factorialTrailingZeroes.trailingZeroes(200));
    }

    @Test
    public void testVeryLargeNumber() {
        assertEquals(249, factorialTrailingZeroes.trailingZeroes(1000));
    }

}
