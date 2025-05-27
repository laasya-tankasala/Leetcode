package interview150.twoPointers;

/*
    You are given an integer array height of length n.
    There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    Find two lines that together with the x-axis form a container, such that the container contains the most water.

    Return the maximum amount of water a container can store.

    Notice that you may not slant the container.

    Constraints:
    n == height.length
    2 <= n <= 105
    0 <= height[i] <= 104

    https://leetcode.com/problems/container-with-most-water/

    GFG article: https://www.geeksforgeeks.org/container-with-most-water/
 */
public class ContainerWithMostWater {

    /*
        Using two-pointer algorithm,

        O(n) time
        O(1) space
     */

    public int maxArea(int[] height) {

        int maxArea = 0;
        int r = height.length-1;
        int l = 0;
        while(r>l) {
            int l_height = height[l];
            int r_height = height[r];
            int possibleArea = (r-l) * Math.min(l_height, r_height);
            maxArea= Math.max(maxArea, possibleArea);
            if(l_height<r_height)
                l++;
            else
                r--;
        }

        return maxArea;
    }

}
