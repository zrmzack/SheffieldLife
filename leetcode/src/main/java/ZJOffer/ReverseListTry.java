package ZJOffer;

/**
 * @author zack
 * @create 2020-01-27-7:43
 */
public class ReverseListTry {
    public ListNode ReverseList(ListNode head) {
        //pre始终指向已反序的最后一个节点
        ListNode pre = null;
        //middle始终指向正在考察节点
        ListNode middle = head;
        //after始终指向待反序的第一个节点，也就是middle之后
        ListNode after = null;
        while(middle != null) {
            //更新after
            after = middle.next;
            //对考察的节点进行反序
            middle.next = pre;
            //更新pre
            pre = middle;
            //后移middle, 换下一个待考察节点
            middle = after;
        }
        //因为pre始终指向已反序的最后的一个节点
        return pre;
    }
}
