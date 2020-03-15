package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-15-20:11
 */
public class AddOne {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        Solution.plusOne(arr);
    }

     static class Solution {
        public static int[] plusOne(int[] digits) {
            int result = 0;
            int length = digits.length;

            for (int i = 0; i < digits.length; i++) {
                result += digits[i] * Math.pow(10, length - 1);
                length--;
            }
            result++;

            System.out.println("我得results==" + result);
            int temp2Length = String.valueOf(result).length();
            int[] digits2 = new int[temp2Length];

            int tempNum = 0;
            while (result > 0) {
                tempNum = result % 10;
                digits2[temp2Length-1] = tempNum;
                temp2Length--;
                result /= 10;
            }
            return digits2;
        }
    }
}
