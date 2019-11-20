package leetcode.leetcode28;

/**
 * @author zack
 * @create 2019-10-31-19:42
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack==null||needle==null){
            return -1;
        }
        int i=haystack.indexOf(needle);

        return i;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.strStr("nihao","n"));
    }
}
