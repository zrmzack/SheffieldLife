package com.leetcode01;

/**
 * @author zack
 * @create 2019-11-04-19:14
 */
public class Solution {

    public static void main(String[] args) {
        System.out.print("     ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("      " + i + "   ");
        }
        System.out.println();
        System.out.println("           ----------------------------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%10s", i * j);
            }
            System.out.println();
        }

    }
}
