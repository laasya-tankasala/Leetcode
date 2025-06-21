package dailyLC;

import java.util.Arrays;

/*
    You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.
    Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:
    The difference between any two elements in one array is less than or equal to k.

    Return a 2D array containing the arrays.
    If it is impossible to satisfy the conditions, return an empty array.
    And if there are multiple answers, return any of them.

    Constraints:

    n == nums.length
    1 <= n <= 105
    n is a multiple of 3
    1 <= nums[i] <= 10^5
    1 <= k <= 10^5

    https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2025-06-18
 */

public class Day250618 {
    /*
        The idea is to sort the array and group 3 consecutive elements.

        time - O(n logn) (sorting)
        space - O(n)
     */
    public int[][] divideArray(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length/3;

        int[][] ans = new int[n][3];

        int start = 0, end = 2;
        int i = 0;

        while(end<nums.length) {
            if(nums[end] - nums[start] > k)
                return new int[][]{};

            ans[i][0] = nums[start];
            ans[i][1] = nums[start+1];
            ans[i][2] = nums[start+2];
            i++;
            start+=3;
            end+=3;
        }

        return ans;

    }
}
