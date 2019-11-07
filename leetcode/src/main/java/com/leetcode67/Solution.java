package com.leetcode67;

/**
 * @author zack
 * @create 2019-11-01-22:42
 */
public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int alen = a.length() - 1, blen = b.length() - 1;
        int count = 0;
        while (alen >= 0 || blen >= 0 || count > 0) {
            if (alen >= 0) {
                count += a.charAt(alen) - '0';
            }
            if (blen >= 0) {
                count += b.charAt(blen) - '0';
            }
            sb.append(count % 2);
            count = count / 2;
            alen--;
            blen--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.addBinary("11","1"));
        System.out.println();
    }
}
