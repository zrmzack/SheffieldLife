package leetcode.leetcode2;

import java.util.List;

/**
 * @author zack
 * @create 2020-01-22-20:09
 */
public class Solution2 {
}


class SolutionTest {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode p = l1;
        ListNode q = l1;
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        int jinwei = 0;
        while (p != null || q != null) {
            int sum = 0;
            if (p != null) {
                sum += p.val;
                p = p.next;
            }
            if (q != null) {
                sum += q.val;
                q = q.next;
            }
            sum += jinwei;
            jinwei = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        if (jinwei != 0) {
            cur.next=new ListNode(jinwei);
            cur=cur.next;
        }
        return temp.next;
    }
}