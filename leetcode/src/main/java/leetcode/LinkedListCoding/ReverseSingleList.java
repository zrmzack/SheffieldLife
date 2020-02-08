package leetcode.LinkedListCoding;

/**
 * @author zack
 * @create 2020-02-08-18:33
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode *next;
 * ListNode(int x) : val(x), next(NULL) {}
 * };
 */
public class ReverseSingleList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = head;
        ListNode tempNext = null;
        while (temp != null) {
            tempNext = temp.next;
            temp.next = pre;
            pre = tempNext;
            temp = tempNext;
        }
        return pre;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}
