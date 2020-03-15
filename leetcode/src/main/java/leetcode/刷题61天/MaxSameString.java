package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-16-5:07
 */
public class MaxSameString {
    public static void main(String[] args) {
        String[] strs={"aa","a"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }
    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            int length = strs.length;
            String ans = strs[0];
            for (int i = 1; i < length; i++) {
                int j=0;
                for (; j < ans.length() && j < strs[i].length(); j++) {
                    char tempx=ans.charAt(j);
                    char tempy=strs[i].charAt(j);
                    if ( tempx!=tempy ) {
                        break;
                    }
                }
                ans=ans.substring(0,j);
                if (ans.equals(""))
                {
                    return "";
                }
            }
            return ans;
        }
    }
}
