package com.zzkun.T5;

import java.util.ArrayList;

public class Solution {

    private void dfs(ArrayList<Integer> list, ListNode node) {
        if(node == null)
            return;
        dfs(list, node.next);
        list.add(node.val);
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(res, listNode);
        return res;
    }
}