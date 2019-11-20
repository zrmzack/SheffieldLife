package leetcode.leetcode58;

/**
 * @author zack
 * @create 2019-11-01-21:32
 */
public class Solution {
    public int lengthOfLastWord(String s) {

        if (s == null) {
            return 0;
        }
        String xx=s.trim();
        String[] words =xx.split("\\s+");

        int x= words[words.length-1].length();
        return x;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLastWord("        "));
    }


}