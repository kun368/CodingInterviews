package com.zzkun.T16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void reverseList() throws Exception {
        ListNode head = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        head.next = b;
        b.next = c;
        c.next = d;

        System.out.println(head);
        head = solution.ReverseList(head);
        System.out.println(head);
    }

}