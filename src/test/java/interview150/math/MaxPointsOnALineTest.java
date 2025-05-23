package interview150.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxPointsOnALineTest {

    MaxPointsOnALine maxPointsOnALine = new MaxPointsOnALine();

    @Test
    public void testThreePointsOnSameLine() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        assertEquals(3, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testHorizontalLine() {
        int[][] points = {{1, 2}, {2, 2}, {3, 2}};
        assertEquals(3, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testVerticalLine() {
        int[][] points = {{2, 1}, {2, 2}, {2, 3}};
        assertEquals(3, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testNoThreeOnSameLine() {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        assertEquals(2, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testSinglePoint() {
        int[][] points = {{1, 1}};
        assertEquals(1, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testTwoPoints() {
        int[][] points = {{0, 0}, {1, 1}};
        assertEquals(2, maxPointsOnALine.maxPoints(points));
    }

    @Test
    public void testZigZag() {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        assertEquals(4, maxPointsOnALine.maxPoints(points));
    }
}

