package leetcode.leetcode104;


/**
 * @author zack
 * @create 2019-11-11-5:27
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth >= rightDepth) return leftDepth+1;
        else return rightDepth+1;
    }

}

