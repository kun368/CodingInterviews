package com.zzkun.T7;

import java.util.Stack;

/**
 * Created by kun36 on 2017/2/2.
 */
public class MyQueue<T> {

    private Stack<T> stack1 = new Stack<T>();
    private Stack<T> stack2 = new Stack<T>();

    public void appendTail(T node) {
        stack1.push(node);
    }

    public T deleteHead() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.isEmpty() ? null : stack2.pop();
    }
}
