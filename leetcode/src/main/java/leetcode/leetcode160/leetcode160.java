package leetcode.leetcode160;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zack
 * @create 2020-01-26-0:17
 */
public class leetcode160 {


}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode p = headA;
        ListNode q = headB;
        while (q != null) {
            set.add(q);
            q = q.next;
        }
        while (p != null) {
            if (set.contains(p)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
