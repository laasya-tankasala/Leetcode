package interview150.arrayOrString;

/*
    You are given an integer array nums. You are initially positioned at the array's first index,
    and each element in the array represents your maximum jump length at that position.

    Return true if you can reach the last index, or false otherwise.

    Constraints:

    1 <= nums.length <= 10^4
    0 <= nums[i] <= 10^5

    https://leetcode.com/problems/jump-game/
 */
public class JumpGame {

    /*
        the idea is to traverse from the end and see if we can skip the 0s we encounter.

        time O(n)
        space O(1)
        where n = nums.length;
     */
    public boolean canJump(int[] nums) {

        if(nums.length==1) return true;

        boolean answer = true;

        int jumpsRequired = 2;
        for(int i = nums.length-1; i>=0; i--) {
            if(answer && nums[i]==0) {
                answer = false;
                if(i==nums.length-1)
                    jumpsRequired=0;
                else
                    jumpsRequired = 1;
            }
            if(!answer) {
                if(nums[i]>=jumpsRequired) answer = true;
                else jumpsRequired++;
            }
        }

        return answer;
    }
}
