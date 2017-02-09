package com.zzkun.T22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Deque<Integer> stack = new ArrayDeque<>();
        if(pushA == null || popA == null || pushA.length != popA.length)
            return false;
        int pos = 0;
        for (int val : popA) {
            while (stack.isEmpty() || val != stack.getLast()) {
                if (pos >= pushA.length)
                    return false;
                stack.addLast(pushA[pos++]);
            }
            stack.pollLast();
        }
        return true;
    }
}