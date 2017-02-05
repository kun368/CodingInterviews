package com.zzkun.T7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {

    @Test
    public void test1() throws Exception {
        Solution queue = new Solution();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

}