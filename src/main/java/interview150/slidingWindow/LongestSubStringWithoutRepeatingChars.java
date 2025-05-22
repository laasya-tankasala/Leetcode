package interview150.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
    Given a string s, find the length of the longest substring without duplicate characters.

    @link https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */

public class LongestSubStringWithoutRepeatingChars {


    /*
    by updating the last index of a character - time O(n) and
    space O(1) given only lowercase letters else O(min(n,m)) where m is the size of character set.
     */

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int first = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && (map.get(s.charAt(i)) >= first))
                first = map.get(s.charAt(i)) + 1;

            map.put(s.charAt(i), i);
            max = Math.max(max, i - first + 1);
        }

        return max;

    }
}
