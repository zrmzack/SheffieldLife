package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-15-10:08
 */
public class ReverArray {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}
