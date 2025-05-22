package interview150.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlusOneTest {

    PlusOne plusOne = new PlusOne();
    @Test
    void testOneElementArrayWithoutCarry() {
        int[] arr = {1};
        assertEquals(2, plusOne.plusOne(arr)[0]);
    }

    @Test
    void testOneElementArrayWithCarry() {
        int[] arr = {9};
        int[] expected = {1,0};
        int[] actual = plusOne.plusOne(arr);
        assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    void testMultipleDigits() {
        int[] arr = {7,8,9,2,3,4};
        int[] expected = {7,8,9,2,3,5};
        int[] actual = plusOne.plusOne(arr);
        assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    void testMultipleDigitsWithCarry() {
        int[] arr = {9,9,9,9,9};
        int[] expected = {1,0,0,0,0,0};
        int[] actual = plusOne.plusOne(arr);
        assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    void testIntegerWithTrailingNines() {
        int[] arr = {2,8,9,9,9};
        int[] expected = {2,9,0,0,0};
        int[] actual = plusOne.plusOne(arr);
        assertTrue(Arrays.equals(expected,actual));
    }




}
