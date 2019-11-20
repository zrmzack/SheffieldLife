package leetcode.leetcode21;

/**
 * @author zack
 * @create 2019-10-31-2:08
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
     ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //如果任意一个得值是空 直接返回另一个
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode firstNode;
        //比较两边大小
        if (l1.val < l2.val) {
            firstNode = l1;
            firstNode.next = mergeTwoLists(l1.next, l2);
        } else {
            firstNode = l2;
            firstNode.next = mergeTwoLists(l1, l2.next);
        }
        return firstNode;
    }



}