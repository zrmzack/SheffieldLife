package leetcode.LinkedListCoding;

/**
 * @author zack
 * @create 2020-02-08-20:34
 */
public class ListCycleLength {
    public ListNode findCycleLength(ListNode head) {
        ListNode tempHead = head;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode one = tempHead;
        ListNode two = tempHead;
        while (two != null) {
            if (one == two) {
                return one;
            }
            one = one.next;
            two = two.next.next;
        }
        return null;
    }

    public int getLength(ListNode head) {
        //cur指向了原先2个点相遇的点
        ListNode cur = findCycleLength(head);
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            length++;
            if (cur == head) {
                return length;
            }
        }
        return length;
    }
}
