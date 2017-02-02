package com.zzkun.T7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/2.
 */
public class MyQueueTest {

    @Test
    public void test1() throws Exception {
        MyQueue<String> queue = new MyQueue<>();
        queue.appendTail("a");
        queue.appendTail("b");
        queue.appendTail("c");
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        queue.appendTail("d");
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

}