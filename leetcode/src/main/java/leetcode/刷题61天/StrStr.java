package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-16-4:53
 */
public class StrStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.equals(needle)){
                return 0;
            }
            if (haystack.length() < needle.length()) {
                return -1;
            }
            if (haystack.length()==0||haystack.length()==0) {
                return 0;
            }
            for (int i = 0; i < haystack.length() - needle.length();i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
