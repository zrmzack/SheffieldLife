package leetcode.LinkedListCoding;

/**
 * @author zack
 * @create 2020-02-08-21:01
 */
public class GetSingleMidNode {
    public ListNode getMid(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode one = head;
        ListNode two = head;
        while (null != one && null != one.next) {
            two = two.next.next;
            one = one.next;
        }
        return one;
    }
}
