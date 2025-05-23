package interview150.math;

import java.util.HashMap;
import java.util.Map;

/*
    Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane,
    return the maximum number of points that lie on the same straight line.

    Constraints:
    1 <= points.length <= 300
    points[i].length == 2
    -104 <= xi, yi <= 104
    All the points are unique.

    @link https://leetcode.com/problems/max-points-on-a-line/
 */
public class MaxPointsOnALine {

    /*
        y = mx + c
        for every unique pair of (m,c), only one single line exists.
        every point has only one line passing through it with a given slope, so c is not required.

        time O(n^2)
        space O(n)
     */
    public int maxPoints(int[][] points) {

        if (points.length <= 2) return points.length;

        int result = 2;
        for (int i = 0; i < points.length; i++)
            result = Math.max(result, maxPointsOnALinePassingThroughThePointI(points, i));

        return result;
    }

    public int maxPointsOnALinePassingThroughThePointI(int[][] points, int i) {

        Map<Double, Integer> uniqueSlopes = new HashMap<>();

        double x1 = points[i][0];
        double y1 = points[i][1];

        int count = 0;

        for (int j = i + 1; j < points.length; j++) {
            double x2 = points[j][0];
            double y2 = points[j][1];

            double m;
            if (x1 == x2) {
                m = Double.POSITIVE_INFINITY;
            } else if (y1 == y2) {
                m = 0.0;
            } else {
                m = (y2 - y1) / (x2 - x1);
            }

            uniqueSlopes.compute(m, (k, v) -> v == null ? 1 : v + 1);

            count = Math.max(count, uniqueSlopes.get(m));
        }
        return count + 1;

    }
}
