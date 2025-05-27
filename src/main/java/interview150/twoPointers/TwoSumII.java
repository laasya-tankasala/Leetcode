package interview150.twoPointers;

/*
    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
    find two numbers such that they add up to a specific target number.
    Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

    The tests are generated such that there is exactly one solution. You may not use the same element twice.
    Your solution must use only constant extra space.

    Constraints:

    2 <= numbers.length <= 3 * 104
    -1000 <= numbers[i] <= 1000
    numbers is sorted in non-decreasing order.
    -1000 <= target <= 1000
    The tests are generated such that there is exactly one solution.

    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    GFG article: https://www.geeksforgeeks.org/pair-with-given-sum-in-sorted-array-two-sum-ii/

 */
public class TwoSumII {

    /*
        using Two pointer algorithm
        O(n) time
        O(1) space
     */

    public int[] twoSum(int[] numbers, int target) {

        int i=0, j= numbers.length-1;
        int ans[] = new int[2];

        while(i<j) {
            int sum = numbers[i]+numbers[j];
            if( sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            } else if(sum > target)
                j--;
            else
                i++;
        }

        return ans;
    }
}
