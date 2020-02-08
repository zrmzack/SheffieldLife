package leetcode.LinkedListCoding;

/**
 * @author zack
 * @create 2020-02-08-19:04
 */
public class ReverseMNSingleList {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //定义一个点指向原先的head
        ListNode tempHead = head;
        //定义一个点拿来指要转换链表得前一个
        ListNode res = null;
        //初始把这个链表指向头节点
        res.next = tempHead;
        //定义一个暂时的节点 指向这个   指着要反转的链表的节点
        ListNode temp = res;
        //默认m《n，截取到m个点
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        //temp.next 之后所有得点都是要反转的点
        ListNode nextHead = temp.next;
        ListNode next = null;
        ListNode pre = null;
        for (int i = m; i <= n; i++) {
            //next 指向temp后 后得点（保存这个点防止丢失）
            next = nextHead.next;
            //pre指向这个后后点
            nextHead.next = pre;
            //newHead 指向pre
            pre = nextHead;
            //走到下一个点
            nextHead = next;
        }
        //temp 的next的 next  指向next点
        temp.next.next = next;
        //temp的next 指向新的链表头
        temp.next = pre;
        return res.next;
    }
}