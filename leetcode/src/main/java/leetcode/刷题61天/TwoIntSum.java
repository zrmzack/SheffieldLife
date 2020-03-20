package leetcode.刷题61天;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;

/**
 * @author zack
 * @create 2020-03-21-6:46
 */
public class TwoIntSum {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int result[] = new int[2];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for(int x=0;x<numbers.length;x++){
                if(hashMap.containsKey(target-numbers[x])){
                    numbers[0]=x;
                    result[1]=hashMap.get(target-numbers[x]);
                    break;
                }
                hashMap.put(numbers[x],x);
            }
            return result;
        }
    }
}
