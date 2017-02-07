package com.zzkun.T15;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void findKthToTail() throws Exception {
        ListNode head = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        head.next = b;
        b.next = c;
        c.next = d;

        for(int i = 1; i <= 4; ++i) {
            System.out.println(solution.FindKthToTail(head, i).val);
        }
    }

}