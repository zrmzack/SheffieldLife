package com.leetcode13;

/**
 * @author zack
 * @create 2019-10-29-18:31
 * <p>
 **/
public class Solution {
    public int RomanToInt(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'I':
                    if (i != arr.length - 1 && arr[i + 1] == 'V') {
                        sum += 4;
                        i++;
                        break;
                    } else if (i != arr.length - 1 && arr[i + 1] == 'X') {
                        sum += 9;
                        i++;
                        break;
                    } else {
                        sum += 1;
                        break;
                    }
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i != arr.length - 1 && arr[i + 1] == 'L') {
                        sum += 40;
                        i++;
                        break;
                    } else if (i != arr.length - 1 && arr[i + 1] == 'C') {
                        sum += 90;
                        i++;
                        break;
                    } else {
                        sum += 10;
                        break;
                    }
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i != arr.length - 1 && arr[i + 1] == 'D') {
                        sum += 400;
                        i++;
                        break;
                    } else if (i != arr.length - 1 && arr[i + 1] == 'M') {
                        sum += 900;
                        i++;
                        break;
                    } else {
                        sum += 100;
                        break;
                    }
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "IM";
        System.out.println(solution.RomanToInt(s));
    }
}
