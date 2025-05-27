package interview150.kadanesAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumCircularSubarrayTest {

    private MaximumSumCircularSubarray maximumSumCircularSubarray;
    @BeforeEach
    void setup() {
        maximumSumCircularSubarray = new MaximumSumCircularSubarray();
    }

    @Test
    void testSingleElement() {
        int[] nums = {3};
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    void testSingleNegativeInteger() {
        int[] nums = {-3};
        assertEquals(-3, maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    void testTypicalCases() {
        int[] nums1 = {5,3,0,-1,-10,4,6,-2};
        assertEquals(16, maximumSumCircularSubarray.maxSubarraySumCircular(nums1));

        int[] nums2 = {5,-3,5};
        assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(nums2));

        int[] nums3 = {6,9,-5};
        assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(nums3));

        int[] nums4 = {-2,4,-5,4,-5,9,4};
        assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(nums4));

        int[] nums5 = {-9,14,24,-14,12,18,-18,-10,-10,-23,-2,-23,11,12,18,-9,9,-29,12,4,-8,15,11,-12,-16,-9,19,-12,22,16};
        assertEquals(99, maximumSumCircularSubarray.maxSubarraySumCircular(nums5));

        int[] nums6 = {2,-2,2,7,8,0};
        assertEquals(19, maximumSumCircularSubarray.maxSubarraySumCircular(nums6));

        int[] nums7 = {6,9,-5,-2};
        assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(nums7));

        int[] nums8 = {5,5,0,-5,3,-3,2};
        assertEquals(12, maximumSumCircularSubarray.maxSubarraySumCircular(nums8));

        int[] nums9 = {0,5,8,-9,9,-7,3,-2};
        assertEquals(16, maximumSumCircularSubarray.maxSubarraySumCircular(nums9));

        int[] nums10 ={-5,-2,5,6,-2,-7,0,2,8};
        assertEquals(14, maximumSumCircularSubarray.maxSubarraySumCircular(nums10));
    }

    @Test
    void testAllPositiveIntegerElements() {
        int[] nums = {1,2,3,2,4,3,7,2};
        assertEquals(24, maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    void testAllNegativeIntegers() {
        int[] nums = {-2,-5,-3,-1,-6};
        assertEquals(-1, maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0,0,0,0};
        assertEquals(0, maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }
}
