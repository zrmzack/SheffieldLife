package ZJOffer;

/**
 * @author zack
 * @create 2020-01-27-18:16
 */
public class mergeList {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode q=list1;
        ListNode p=list2;
        ListNode listNode =null;
        if (q.val <= p.val) {
            listNode = q;
            listNode.next = Merge(q.next, p);
        }
        if (p.val > q.val) {
            listNode = p;
            listNode.next = Merge(q, p.next);
        }

        return listNode;
    }
}
