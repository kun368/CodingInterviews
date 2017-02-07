package com.zzkun.T15;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0)
            return null;
        ListNode a = head, b = head;
        for(int i = 0; i < k - 1; ++i) {
            if(b.next == null)
                return null;
            b = b.next;
        }
        while(b.next != null) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}