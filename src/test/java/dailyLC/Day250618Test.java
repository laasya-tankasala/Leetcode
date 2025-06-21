package dailyLC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day250618Test {
    @Test
    public void testValidDivision() {
        Day250618 solution = new Day250618();

        int[] nums = {2, 3, 4, 9, 10, 11};
        int k = 2;

        int[][] expected = {
                {2, 3, 4},
                {9, 10, 11}
        };

        assertArrayEquals(expected, solution.divideArray(nums, k));
    }

    @Test
    public void testInvalidDivisionDueToK() {
        Day250618 solution = new Day250618();

        int[] nums = {1, 2, 3, 10, 11, 15};
        int k = 2;

        int[][] expected = {};  // Cannot divide since 15 - 10 > k

        assertArrayEquals(expected, solution.divideArray(nums, k));
    }

    @Test
    public void testSingleGroupValid() {
        Day250618 solution = new Day250618();

        int[] nums = {5, 6, 7};
        int k = 2;

        int[][] expected = {
                {5, 6, 7}
        };

        assertArrayEquals(expected, solution.divideArray(nums, k));
    }

    @Test
    public void testSingleGroupInvalid() {
        Day250618 solution = new Day250618();

        int[] nums = {5, 6, 10};
        int k = 2;

        int[][] expected = {};

        assertArrayEquals(expected, solution.divideArray(nums, k));
    }
}
