package com.zzkun.T17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void merge() throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        c.next = d;
        ListNode head = solution.Merge(a, c);
        System.out.println(head);
    }

}