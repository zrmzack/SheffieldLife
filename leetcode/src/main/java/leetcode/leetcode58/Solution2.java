package leetcode.leetcode58;

/**
 * @author zack
 * @create 2019-11-01-21:50
 */
public class Solution2 {
    public int lengthOfLastWord(String s) {
        String s1[] = s.split(" ");    //split and put the strings in array excluding space.
        if(s1.length==0)              // if it contains all space then size of array s1 would be zero.
            return 0;
        else
            return s1[s1.length-1].length();
    }
}
