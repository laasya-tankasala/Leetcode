package interview150.arrayOrString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIITest {
    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII;

    @BeforeEach
    public void setup() {
        bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
    }

    @Test
    void testAscendingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(prices)); // Buy at 1, sell at 5
    }

    @Test
    void testDescendingPrices() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(prices)); // No profit possible
    }

    @Test
    void testZigZagPrices() {
        int[] prices = {1, 5, 3, 6, 4};
        assertEquals(7, bestTimeToBuyAndSellStockII.maxProfit(prices)); // Buy-sell on (1-5), (3-6)
    }

    @Test
    void testSingleDay() {
        int[] prices = {3};
        assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(prices)); // No transactions possible
    }

    @Test
    void testEmptyPrices() {
        int[] prices = {};
        assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(prices)); // No transactions possible
    }

    @Test
    void testAllSamePrices() {
        int[] prices = {2, 2, 2, 2};
        assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(prices)); // No profit
    }

    @Test
    void testComplexPrices() {
        int[] prices = {2, 1, 2, 0, 1};
        assertEquals(2, bestTimeToBuyAndSellStockII.maxProfit(prices)); // Buy-sell (1), (0-1)
    }
}
