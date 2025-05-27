package interview150.kadanesAlgorithm;

import java.util.ArrayList;
import java.util.List;

/*
    Given a circular integer array nums of length n,
    return the maximum possible sum of a non-empty subarray of nums.

    A circular array means the end of the array connects to the beginning of the array.
    Formally, the next element of nums[i] is nums[(i + 1) % n] and
    the previous element of nums[i] is nums[(i - 1 + n) % n].

    A subarray may only include each element of the fixed buffer nums at most once.
    Formally, for a subarray nums[i], nums[i + 1], ..., nums[j],
    there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.

    Constraints:
    n == nums.length
    1 <= n <= 3 * 10^4
    -3 * 10^4 <= nums[i] <= 3 * 10^4

    https://leetcode.com/problems/maximum-sum-circular-subarray/

    GFG article: https://www.geeksforgeeks.org/maximum-contiguous-circular-sum

 */
public class MaximumSumCircularSubarray {

    /*
        Using Kadane's Algorithm
        O(n) time
        O(1) space
     */
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int currSumMax =0;
        int currSumMin =0;
        int total=0;
        int min =nums[0];

        for(int i : nums) {

            currSumMax = Math.max( currSumMax+i, i);
            max = Math.max(max, currSumMax);

            currSumMin = Math.min(i, currSumMin+i);
            min = Math.min(currSumMin, min);

            total+=i;

        }
        if(max<0) return max;

        return Math.max(total-min, max);
    }

    public int maxSubarraySumCircularBruteForce(int[] nums) {
        int max = 0;
        int currSum =0;
        int i =0;
        List<Integer> negatives = new ArrayList<>();
        for(; i<nums.length; i++) {
            if(nums[i]<0)
                negatives.add(i);
            max+=nums[i];
        }

        if(negatives.isEmpty()) return max;

       for(int e : negatives) {

           int currMax=nums[e];
           currSum=0;
           i=0;

           for(int j=e+1;i<nums.length ; j++) {
               if(j==nums.length) j = 0;
               currSum+=nums[j];
               if(currMax<currSum)
                   currMax= currSum;
               if(currSum<0)
                   currSum=0;
               i++;
           }
            max = Math.max(max, currMax);

       }

        return max;
    }
}
