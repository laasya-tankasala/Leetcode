package interview150.twoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumIITest {

    private TwoSumII twoSumII;

    @BeforeEach
    void setUp() {
       twoSumII = new TwoSumII();
    }

    @Test
    void testArrayWithTwoElements() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] actual = twoSumII.twoSum(numbers, target);
        assertEquals(1, actual[0]);
        assertEquals(2,actual[1]);

    }

    @Test
    void testArrayWithMoreElements() {
        int[] numbers = {-10, -1, 0, 2, 4, 8, 11};
        int target = 3;
        int[] actual = twoSumII.twoSum(numbers, target);
        assertEquals(2, actual[0]);
        assertEquals(5, actual[1]);
    }
}
