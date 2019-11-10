package com.leetcode101;

/**
 * @author zack
 * @create 2019-11-11-5:30
 */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return judge(root, root);
    }

    public boolean judge(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if ((left == null || right == null) || (left == null || right == null)) {
            return false;
        }
        return (left.val == right.val) && judge(left.left, right.right) && judge(left.right, right.left);

    }
}
