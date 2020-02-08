package leetcode.LinkedListCoding;

import java.util.HashMap;

/**
 * @author zack
 * @create 2020-02-08-19:53
 */
public class JudgeWhetherContainCycle {
    public ListNode findCycle(ListNode head) {
        HashMap<ListNode, ListNode> hashMap = new HashMap<>();
        ListNode tempHead = head;
        while (tempHead != null) {
            if (hashMap.containsKey(tempHead)) {
                return tempHead;
            } else {
                hashMap.put(tempHead, tempHead);
                tempHead = tempHead.next;
            }
        }
        //没找到就null
        return null;
    }
}
