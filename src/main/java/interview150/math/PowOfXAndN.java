package interview150.math;

/*
    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

    Constraints:
    -100.0 < x < 100.0
    -231 <= n <= 231-1
    n is an integer.
    Either x is not zero or n > 0.
    -104 <= xn <= 104

    https://leetcode.com/problems/powx-n/
 */
public class PowOfXAndN {

    /*
        brute force
        time O(n)
        space O(1)
     */
    public double myPowBrute(double x, int n) {

        int ans = 1;
        while(n!=0)  {
            if(n<0) {
                ans *= x;
                n--;
            } else {
                ans/=x;
                n++;
            }
        }

        return ans;
    }

    /*
        Using Divide And Conquer
        time O(log n)
        space O(log n) recursive calls stored in the stack.
     */
    public double myPowDnC(double x, int n) {

        if(n == 0) return 1;

        if(n<0) return 1/myPowDnC(x, -n);

        if(n%2==0)
            return myPowDnC(x, n/2) * myPowDnC(x, n/2);
        else
            return myPowDnC(x, n/2) * myPowDnC(x, n/2) * x;
    }

    /*
        Using Iterative approach

        time O(logn)
        space O(1)
     */

    public double myPow(double x, int n) {

        long N = n; // to deal with Integer.MIN_VALUE since -n would > Integer.MAX_VALUE
        if(N<0){
            x = 1/x;
            N = -N;
        }

        double result = 1.0;
        while(N>0) {
            if (N % 2 == 1)
                result *= x;

            x*=x ;
            N /= 2;
        }

        return result;

    }
}
