package interview150.math;

/*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
    The returned integer should be non-negative as well.
    You must not use any built-in exponent function or operator.

    Constraints:
    x is a non-negative integer.

    @link https://leetcode.com/problems/sqrtx/
*/
public class SqrtOfX {

    /*  Using loop
        we need the max. possible value of i such that i*i <= x
        so, increment i until i<=x/i;
        Q: Why i*i <= x is not the while loop condition?
        Ans: Because for larger integers, value of i*i would be greater than max integer value and the condition may not
        work as intended.

        time O(n)
        space O(1)
     */
    public int sqrt(int x) {

        if(x<2) return x;

        int i = 1;
        while (i<=x/i)
            i++;

        return i-1;

    }

    /*
        Using binary search
        time O(logn)
        space O(1)
     */
    public int mySqrt(int x) {

        if(x==0) return 0;

        int res = 1;
        int low = 1, high = x;

        while(low<=high) {

            int mid = low + (high-low)/2;

            if(mid <= x/mid) {
                res = mid;
                low = mid+1;
            } else
                high = mid -1;

        }

        return res;
    }
}
