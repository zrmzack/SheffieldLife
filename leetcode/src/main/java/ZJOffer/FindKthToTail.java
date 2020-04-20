package ZJOffer;

import java.util.ArrayList;

/**
 * @author zack
 * @create 2020-01-27-7:38
 */
public class FindKthToTail {
    public ListNode findkthtotail(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode temp = head;
        ArrayList<ListNode> arrayList = new ArrayList();
        while (temp != null) {
            arrayList.add(temp);
            temp = temp.next;
        }
        if (k>arrayList.size()){
            return null;
        }
        return arrayList.get(arrayList.size() -1- k);
    }

    public static void main(String[] args) {

    }
}
