package interview150.kadanesAlgorithm;

/*
    Given an integer array nums, find the subarray with the largest sum, and return its sum.

    Constraints:
    1 <= nums.length <= 10^5
    -10^4 <= nums[i] <= 10^4

    https://leetcode.com/problems/maximum-subarray/

    GFG article: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class MaximumSubarray {

    /*
        Using Kadane's Algorithm
        O(n) time
        O(1) space
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currSum =0;
        for(int i : nums) {
            currSum+=i;
            if(max<currSum)
                max= currSum;
            if(currSum<0)
                currSum=0;
        }

        return max;
    }
}
