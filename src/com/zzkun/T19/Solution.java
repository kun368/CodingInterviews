package com.zzkun.T19;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void Mirror(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()) {
            TreeNode first = qu.poll();
            if(first == null)
                continue;
            TreeNode tmp = first.left;
            first.left = first.right;
            first.right = tmp;
            qu.add(first.left);
            qu.add(first.right);
        }
    }
}