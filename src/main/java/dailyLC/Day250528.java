package dailyLC;
/*
    #2894
    You are given positive integers n and m.
    Define two integers as follows:
    num1: The sum of all integers in the range [1, n] (both inclusive) that are not divisible by m.
    num2: The sum of all integers in the range [1, n] (both inclusive) that are divisible by m.

    Return the integer num1 - num2.

    Constraints:
    1 <= n, m <= 1000

    https://leetcode.com/problems/divisible-and-non-divisible-sums-difference

 */
public class Day250528 {

    /*
        the idea is to calculate the total sum of n numbers using n(n+1)/2
        and then removing 2x sum of all "divisible by m" numbers.

        constant time and space.

     */
    public int differenceOfSums(int n, int m) {
        int totalSum = (n*(n+1))/2;

        // m + 2m + 3m+...... (n/m) m = (1+2+3+....+n/m) * m
        int totalDivisible = n/m;
        int twiceTheDivisibleSum = (totalDivisible*(totalDivisible+1)*m);

        return totalSum-twiceTheDivisibleSum;

    }
}
