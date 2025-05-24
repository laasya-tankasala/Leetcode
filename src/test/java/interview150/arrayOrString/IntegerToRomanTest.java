package interview150.arrayOrString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {

    IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    void testSingleDigitIntegers() {
        assertEquals("IV", integerToRoman.intToRoman(4));
        assertEquals("V", integerToRoman.intToRoman(5));
        assertEquals("VIII", integerToRoman.intToRoman(8));
        assertEquals("II", integerToRoman.intToRoman(2));
    }

    @Test
    void testTwoDigitIntegers() {
        assertEquals("XXII", integerToRoman.intToRoman(22));
        assertEquals("L", integerToRoman.intToRoman(50));
        assertEquals("LXVI", integerToRoman.intToRoman(66));
        assertEquals("XCIV", integerToRoman.intToRoman(94));
    }

    @Test
    void testThreeDigitIntegers() {
        assertEquals("CCII", integerToRoman.intToRoman(202));
        assertEquals("CDXL", integerToRoman.intToRoman(440));
        assertEquals("D", integerToRoman.intToRoman(500));
        assertEquals("DCCXXIV", integerToRoman.intToRoman(724));
    }

    @Test
    void testFourDigitIntegers() {
        assertEquals("M", integerToRoman.intToRoman(1000));
        assertEquals("MMCMIV", integerToRoman.intToRoman(2904));
        assertEquals("MXXV", integerToRoman.intToRoman(1025));
        assertEquals("MMMCMXCIX", integerToRoman.intToRoman(3999));
    }
}
