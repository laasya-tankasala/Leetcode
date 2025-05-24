package interview150.math;

/*
    Given an integer n, return the number of trailing zeroes in n!.
    Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

    Constraints:
    0 <= n <= 10^4

    https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {

        int ans = 0;
        int fivePower = 5;

        while(n>=fivePower) {
            ans += n/fivePower;
            fivePower*=5;
        }

        return ans;
    }

}
