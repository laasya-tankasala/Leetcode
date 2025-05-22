package interview150.math;

/*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    @link https://leetcode.com/problems/palindrome-number/
*/
public class PalindromeNumber {

    // O(n) time and O(1) space
    public boolean isPalindrome(int x) {

        if (x < 0) return false;
        int copy = x;
        int reversed = 0;

        while (copy != 0) {
            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }

        if (reversed == x)
            return true;

        return false;

    }
}
