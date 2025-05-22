package interview150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @Test
    void testSingleDigit() {
        int x = 1;
        assertTrue(palindromeNumber.isPalindrome(x));
    }

    @Test
    void testNonPalindrome() {
        int x = 234;
        assertFalse(palindromeNumber.isPalindrome(x));

    }

    @Test
    void testPalindrome() {
        int x = 232;
        assertTrue(palindromeNumber.isPalindrome(x));

    }

    @Test
    void testLengthyPalindrome() {
        int x = 234565432;
        assertTrue(palindromeNumber.isPalindrome(x));
    }

    @Test
    void testNonLengthyPalindrome() {
        int x = 234561232;
        assertFalse(palindromeNumber.isPalindrome(x));
    }

    @Test
    void testNegativeInteger() {
        int x = -112211;
        assertFalse(palindromeNumber.isPalindrome(x));
    }




}
