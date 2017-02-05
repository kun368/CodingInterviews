package com.zzkun.T6;


public class Solution {

    private TreeNode constructCore(int[] pre, int st1, int ed1, int[] in, int st2, int ed2) {
        TreeNode root = new TreeNode(pre[st1]);
        if(st1 < ed1) {
            for(int i = st2; i <= ed2; ++i) {
                if(in[i] == root.val) {
                    int szl = i - st2;
                    int szr = ed2 - i;
                    if(szl > 0)
                        root.left = constructCore(pre, st1 + 1, st1 + szl, in, st2, i - 1);
                    if(szr > 0)
                        root.right = constructCore(pre, ed1 - szr + 1, ed1, in, i + 1, ed2);
                    break;
                }
            }
        }
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return constructCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
}