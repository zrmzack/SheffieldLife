package leetcode.刷题61天;

import java.util.HashMap;

/**
 * @author zack
 * @create 2020-03-17-16:22
 */
public class CountChars {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            if (words.length == 0 || chars.length() == 0) {
                return 0;
            }
            ;
            char[] ch = chars.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            int ans = 0;
            for (char c : ch) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int len = words.length;
            for (int i = 0; i <= len - 1; i++) {
                boolean flag = false;
                char[] cc = words[i].toCharArray();
                HashMap<Character, Integer> temp = (HashMap) map.clone();

                for (int j = 0; j <= cc.length - 1; j++) {
                    if (!map.containsKey(cc[j])) {
                        flag = true;
                        break;
                    }//no such,break
                    else {
                        if (temp.get(cc[j]) >= 1) {
                            temp.put(cc[j], temp.get(cc[j]) - 1);
                        }
                        else {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) {
                    continue;
                }
                ans += words[i].length();
            }
            return ans;
        }
    }
}
