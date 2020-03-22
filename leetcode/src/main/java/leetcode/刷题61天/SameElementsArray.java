package leetcode.刷题61天;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zack
 * @create 2020-03-22-7:47
 */
public class SameElementsArray {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int x = 0; x < nums.length; x++) {
                if (nums[x+1]==nums[x]){
                    return true;
                }
            }
            return false;
        }
    }
}