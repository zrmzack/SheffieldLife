package leetcode.leetcode83;

/**
 * @author zack
 * @create 2019-11-06-0:55
 */
public class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;
        while (first != null && first.next != null) {
            if (first.val == first.next.val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }
        return head;
    }
}
