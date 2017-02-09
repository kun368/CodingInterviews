package com.zzkun.T21;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> min = new LinkedList<>();
    
    public void push(int node) {
        stack.add(node);
        if(min.isEmpty())
            min.add(node);
        else
            min.add(Math.min(node, min.getLast()));
    }
    
    public void pop() {
        stack.removeLast();
        min.removeLast();
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int min() {
        return min.getLast();
    }
}