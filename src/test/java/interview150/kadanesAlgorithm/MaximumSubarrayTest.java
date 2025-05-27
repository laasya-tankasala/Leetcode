package interview150.kadanesAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;
    @BeforeEach
    void setup() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void testSingleElement() {
        int[] nums = {3};
        assertEquals(3, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void testTypicalCase() {
        int[] nums = {5,3,0,-1,-10,4,6,-2};
        assertEquals(10, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void testAllPositiveIntegerElements() {
        int[] nums = {1,2,3,2,4,3,7,2};
        assertEquals(24, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void testAllNegativeIntegers() {
        int[] nums = {-2,-5,-3,-1,-6};
        assertEquals(-1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0,0,0,0};
        assertEquals(0, maximumSubarray.maxSubArray(nums));
    }
}
