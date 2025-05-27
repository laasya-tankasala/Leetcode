package interview150.twoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setup() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void testArrayWithTwoElements() {
        int[] height = {2,4};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(2, maxArea);

    }

    @Test
    void testIncreasingArray() {
        int[] height = {1,3,5,6,7,10};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(15, maxArea);

    }

    @Test
    void testDecreasingArray() {
        int[] height = {12, 9, 8, 5, 3};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(16, maxArea);
    }

    @Test
    void testNonSortedArray() {
        int[] height = {1,3,5,4,2,1};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(6, maxArea);
    }

    @Test
    void testAllSameHeight() {
        int[] height = {3,3,3,3,3,3};
        int maxArea = containerWithMostWater.maxArea(height);
        assertEquals(15, maxArea);
    }
}
