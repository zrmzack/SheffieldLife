import java.util.LinkedList;

/**
 * @author zack
 * @create 2020-02-02-17:27
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;
int k=0;
        ListNode node1 = pHead1, node2 = pHead2;
        int length1 = 0, length2 = 0;
        // 遍历两个链表
        while (node1 != null) {
            length1 += 1;
            node1 = node1.next;
        }
        while (node2 != null) {
            length2 += 1;
            node2 = node2.next;
        }
        //对较长链表的头结点进行处理，先走k步
        if (length1 >= length2) {
             k = length1 - length2;
            while (k != 0) {
                pHead1 = pHead1.next;
                k--;
            }
        } else {
             k = length2 - length1;
            while (k != 0) {
                pHead2 = pHead2.next;
                k--;
            }
        }

        //遍历第一个相同的节点就是第一个公共节点
        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;


    }
}
