package com.leetcode107;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2019-11-11-7:21
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        List<TreeNode> list = new ArrayList();
        if (root == null) return result;
        list.add(root);
        while (!list.isEmpty()) {
            List<Integer> curlist = new ArrayList();
            List<TreeNode> nextlist = new ArrayList();
            for (TreeNode cur : list) {
                curlist.add(cur.val);
                if (cur.left != null) nextlist.add(cur.left);
                if (cur.right != null) nextlist.add(cur.right);
            }
            list = nextlist;
            result.add(0, curlist); // 先近先出
        }
        return result;
    }

}