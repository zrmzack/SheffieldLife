package leetcode.leetcode3;

/**
 * @author zack
 * @create 2020-01-23-21:16
 */
public class leetcode3 {
    public static void main(String[] args) {

    }

}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int max = 0;
        boolean[] used = new boolean[500];
        while (right < s.length()) {
            if (used[s.charAt(right)] == false) {
                used[s.charAt(right)] = true;
                right++;
            } else {
                max = Math.max(max, right - left);
                while (left < right && s.charAt(right) != s.charAt(left)) {
                    used[s.charAt(left)] = false;
                    left++;
                }
                left++;
                right++;
            }
        }
        max = Math.max(max, right - left);
        return max;

    }
}
