package ZJOffer;

import java.util.ArrayList;

/**
 * @author zack
 * @create 2020-01-26-13:49
 */
public class reverseList {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode temp = listNode;
        ArrayList<Integer> a1 = new ArrayList();
        ArrayList<Integer> a2 = new ArrayList();
        while (temp != null) {
            a1.add(temp.val);
            temp = temp.next;
        }
        for (int x = a1.size(); x > 0; x--) {
            a2.add(a1.get(x));
        }
        return a2;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
