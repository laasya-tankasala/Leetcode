package interview150.arrayOrString;

/*
    Given an integer, convert it to a Roman numeral.

    Constraints:
    1 <= num <= 3999

    https://leetcode.com/problems/integer-to-roman/

    GFG article: https://www.geeksforgeeks.org/converting-decimal-number-lying-between-1-to-3999-to-roman-numerals/
 */
public class IntegerToRoman {

    /*
        time O(n)
        space O(n)
     */
    public String intToRoman(int num) {

        StringBuilder romanNumeral = new StringBuilder();

        int[] baseValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] correspondingRomanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i< baseValues.length; i++) {
            int quotient = num/baseValues[i];

            while(quotient!=0) {
                romanNumeral= romanNumeral.append(correspondingRomanNumerals[i]);
                quotient--;
            }

            num%=baseValues[i];

            if(num==0) break;
        }


        return romanNumeral.toString();
    }

}
