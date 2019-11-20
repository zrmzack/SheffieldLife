package leetcode.leetcode13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zack
 * @create 2019-10-30-1:38
 */
public class Solution2 {

    public int RomanToInt(String x) {
        int value = 0;
        int i = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        while (i < x.length()) {
            if (i + 2 < x.length()+1 && map.containsKey(x.substring(i, i + 2))) {
                value += map.get(x.substring(i, i + 2));
                i += 2;
            } else if (i + 1 < x.length() && map.containsKey(x.substring(i, i + 1))) {
                value += map.get(x.substring(i, i + 1));
                i += 1;
            } else {
               break;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.RomanToInt("IVIII"));
    }
}
