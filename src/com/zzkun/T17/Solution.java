package com.zzkun.T17;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode a = new ListNode(-1);
        ListNode head = a;
        while(list1 != null || list2 != null) {
            if(list2 == null || (list1 != null && list1.val < list2.val)) {
                a.next = list1;
                list1 = list1.next;
            } else {
                a.next = list2;
                list2 = list2.next;
            }
            a = a.next;
        }
        return head.next;
    }
}