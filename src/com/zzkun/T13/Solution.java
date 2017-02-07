package com.zzkun.T13;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class Solution {
    public ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        if(head == null || toBeDeleted == null)
            return null;
        if(head == toBeDeleted)
            return head.next;
        if(toBeDeleted.next == null) {
            ListNode p = head;
            while(p.next.next != null)
                p = p.next;
            p.next = null;
        } else {
            toBeDeleted.val = toBeDeleted.next.val;
            toBeDeleted.next = toBeDeleted.next.next;
        }
        return head;
    }
}
