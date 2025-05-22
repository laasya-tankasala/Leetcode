package interview150.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int n = words[0].length();
        int frontPtr = 0;
        int count = 0;
        boolean flag = true;

        Map<String, Integer> actualMap = new HashMap<>();
        Map<String, Integer> subMap = new HashMap<>();

        for (String key : words)
            actualMap.compute(key, (k, v) -> v == null ? 1 : v + 1);

        for (int i = 0; i < s.length() - n + 1; ) {
            String sub = s.substring(i, i + n);

            if (actualMap.containsKey(sub)) {

                subMap.compute(sub, (k, v) -> v == null ? 1 : v + 1);
                count++;
                i += n;

                if (count == words.length) {
                    for (String key : actualMap.keySet()) {
                        if (actualMap.get(key).equals(subMap.get(key)))
                            flag = false;
                    }

                    if (flag) {
                        ans.add(frontPtr);
                    }

                    i = frontPtr + 1;
                    frontPtr = i;
                    //System.out.println(frontPtr);
                    count = 0;
                    subMap.clear();
                    flag = true;
                }

            } else {
                i = frontPtr + 1;
                subMap.clear();
                count = 0;
                frontPtr = i;
                flag = true;
            }

        }

        return ans;
    }

}
