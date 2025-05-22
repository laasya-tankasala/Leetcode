package interview150.slidingWindow;


/*
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.

@link https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum{

    //using two pointers or sliding window - time O(n) and space O(1)
    public int minSizeSubarray(int target, int[] nums){

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int leftPtr =0;

        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];

            while(sum>=target)
            {
                if(min> (i-leftPtr+1))
                    min = i-leftPtr+1;
                sum-=nums[leftPtr];
                leftPtr++;
            }
        }

        return min == Integer.MAX_VALUE? 0 : min;
    }
}
