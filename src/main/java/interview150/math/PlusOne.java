package interview150.math;

/*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
    integer. The digits are ordered from the most significant to the least significant in left-to-right order.
    The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.

    Constraints:
    1 <= digits.length <= 100
    0 <= digits[i] <= 9
    digits does not contain any leading 0's.

    https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    /*
        time - O(n)
        space -
            best case: O(1)
            worst case: O(n)
     */
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans_arr = new int[digits.length+1];
        ans_arr[0] = 1;
        return ans_arr;

    }
}
