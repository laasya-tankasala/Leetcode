package interview150.arrayOrString;

/*
    Given a roman numeral, convert it to an integer.

    Constraints:
    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].

    https://leetcode.com/problems/roman-to-integer/

    GFG article: https://www.geeksforgeeks.org/roman-number-to-integer/
 */
public class RomanToInteger {

    /*
        Using switch condition.
        time O(n)
        space O(1)
     */
    public int romanToInt(String s) {

        int integerVal = 0;

        for(int i =0; i< s.length(); i++) {

            switch (s.charAt(i)) {
                case 'I':
                    if(i!= s.length()-1 && s.charAt(i+1)=='V') {
                        integerVal+=4;
                        i++;
                    }
                    else if(i!= s.length()-1 && s.charAt(i+1)=='X') {
                        integerVal+=9;
                        i++;
                    }
                    else
                        integerVal += 1;

                    break;

                case 'V':
                    integerVal += 5;
                    break;

                case 'X':
                    if(i!= s.length()-1 && s.charAt(i+1)=='L') {
                        integerVal+=40;
                        i++;
                    }
                    else if(i!= s.length()-1 && s.charAt(i+1)=='C') {
                        integerVal+=90;
                        i++;
                    }
                    else
                        integerVal += 10;

                    break;

                case 'L':
                    integerVal += 50;
                    break;

                case 'C':
                    if(i!= s.length()-1 && s.charAt(i+1)=='D') {
                        integerVal+=400;
                        i++;
                    }
                    else if(i!= s.length()-1 && s.charAt(i+1)=='M') {
                        integerVal+=900;
                        i++;
                    }
                    else
                        integerVal += 100;

                    break;

                case 'D':
                    integerVal += 500;
                    break;

                case 'M':
                    integerVal += 1000;
                    break;
            }
        }


        return integerVal;
    }
}
