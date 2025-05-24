package interview150.arrayOrString;

/*
    Given an input string s, reverse the order of the words.
    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    Return a string of the words in reverse order concatenated by a single space.
    Note that s may contain leading or trailing spaces or multiple spaces between two words.
    The returned string should only have a single space separating the words. Do not include any extra spaces.

    Constraints:
    1 <= s.length <= 10^4
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

    https://leetcode.com/problems/reverse-words-in-a-string/

    GFG article: https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
 */

public class ReverseWordsInAString {

    /*
        alternatively, you can reverse the words using Collections.reverse() and append with String.join();

        time O(n)
        space O(n)
        where n is number of words

     */
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+"); // to deal with all kinds of white spaces.
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length-1; i>=0; i--)
            reversed.append(words[i]).append(" ");

        return reversed.toString().trim();

    }

}
