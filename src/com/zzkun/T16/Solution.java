package com.zzkun.T16;

public class Solution {

    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}