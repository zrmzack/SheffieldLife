package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-12-10:22
 */
public class DiveStringSelf {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length(), len2 = str2.length();
            //比较str1和str2的开头第1个字符和末尾第1个字符
            if (str1.charAt(0) != str2.charAt(0) || str1.charAt(len1 - 1) != str2.charAt(len2 - 1)) {
                return "";
            }
            //取str1的长度 和 str2的长度 的最大公约数
            while (len2 != 0) {
                len1 = len1 % len2;
                len1 ^= len2;
                len2 ^= len1;
                len1 ^= len2;
            }
            String pattern1 = str1.substring(0, len1), pattern2 = str2.substring(0, len1);
            return pattern1.equals(pattern2) ? pattern1 : "";

        }

    }
}
