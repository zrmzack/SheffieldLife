package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-14-10:26
 */
public class ReverseChar {
    public void reverseChar(char s[]) {
        DealHelpChar(0, s.length, s);
    }

    private void DealHelpChar(int start, int end, char[] s) {
        if (start >= end) {
            return;
        }
        char tempChar = s[start];
        s[start] = s[end];
        s[end] = tempChar;
        DealHelpChar(start+1, end-1, s);
    }
}
