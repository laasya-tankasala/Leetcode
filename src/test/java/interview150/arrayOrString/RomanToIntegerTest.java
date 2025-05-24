package interview150.arrayOrString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void testSingleDigitRomanNumerals() {
        String s1 = "III";
        String s2 = "VI";
        String s3 = "IV";
        String s4 = "IX";
        assertEquals(3, romanToInteger.romanToInt(s1));
        assertEquals(6, romanToInteger.romanToInt(s2));
        assertEquals(4, romanToInteger.romanToInt(s3));
        assertEquals(9, romanToInteger.romanToInt(s4));
    }

    @Test
    void testTwoDigitRomanNumerals() {
        String s1 = "XXI";
        String s2 = "XL";
        String s3 = "LXVI";
        String s4 = "XCVIII";
        assertEquals(21, romanToInteger.romanToInt(s1));
        assertEquals(40, romanToInteger.romanToInt(s2));
        assertEquals(66, romanToInteger.romanToInt(s3));
        assertEquals(98, romanToInteger.romanToInt(s4));
    }

    @Test
    void testThreeDigitRomanNumerals() {
        assertEquals(100, romanToInteger.romanToInt("C"));
        assertEquals(345, romanToInteger.romanToInt("CCCXLV"));      // 300 + 40 + 5
        assertEquals(582, romanToInteger.romanToInt("DLXXXII"));     // 500 + 50 + 10 + 10 + 10 + 1 + 1
        assertEquals(999, romanToInteger.romanToInt("CMXCIX"));      // 900 + 90 + 9
    }

    @Test
    void testFourDigitRomanNumerals() {
        assertEquals(1000, romanToInteger.romanToInt("M"));
        assertEquals(1666, romanToInteger.romanToInt("MDCLXVI"));    // 1000 + 500 + 100 + 50 + 10 + 5 + 1
        assertEquals(1987, romanToInteger.romanToInt("MCMLXXXVII")); // 1000 + 900 + 80 + 7
        assertEquals(2023, romanToInteger.romanToInt("MMXXIII"));    // 2000 + 20 + 3
        assertEquals(3999, romanToInteger.romanToInt("MMMCMXCIX"));  // 3000 + 900 + 90 + 9 (max valid Roman numeral)
    }

}
