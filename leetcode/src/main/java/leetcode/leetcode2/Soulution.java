package leetcode.leetcode2;


import java.util.List;

/**
 * @author zack
 * @create 2020-01-22-18:25
 */
public class Soulution {


    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //新建节点
        ListNode temp = new ListNode(0);
        //新建cur节点temp
        ListNode cur = temp;
        //进位符号
        int carry = 0;
        while (l1 != null && l2 != null) {
            //如果两个链表的值都对应上了，那么就开始一个个对应相加（加上进位）
            int dig = l1.val + l2.val + carry;
            //val 存储当前的相加后值得个位数
            int val = dig % 10;
            //carry 拿来存储进位
            carry = dig / 10;
            ListNode listNode = new ListNode(val);
            cur.next=listNode;

            //将所有节点往后移动一位
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            cur.next = new ListNode(val);
            //将所有节点往后移动一位
            cur = cur.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            cur.next = new ListNode(val);
            //将所有节点往后移动一位
            cur = cur.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            cur.next=new ListNode(carry);
        }
        return temp.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}