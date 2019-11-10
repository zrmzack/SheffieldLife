package com.leetcode104;

/**
 * @author zack
 * @create 2019-11-11-6:36
 */

public class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = maxDepth(root.left) + 1;
        int y = maxDepth(root.right) + 1;
        if (x > y) return x;
        else return y;
    }
}
