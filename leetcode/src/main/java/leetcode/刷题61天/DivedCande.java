package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-05-0:04
 */
public class DivedCande {
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            if (candies == 0 || num_people == 0) {
                return null;
            }
            int[] result = new int[num_people];
            int sum = 1;
            while (candies > 0) {
                for (int i = 0; i < result.length; i++) {
                    if (candies - sum > 0) {
                        result[i] += sum;
                        candies -= sum;
                        sum++;
                    } else {
                        result[i] += candies;
                        candies = 0;
                        break;
                    }
                }
            }
            return result;
        }


    }

    class Solution2 {
        public int[] distributeCandies(int candies, int num_people) {

            return null;
        }
    }
}