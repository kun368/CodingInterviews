package com.zzkun.T18;


public class Solution {

    private boolean dfsCheck(TreeNode root1, TreeNode root2) {
        if(root2 == null)
            return true;
        return (root1 != null && root1.val == root2.val)
                && dfsCheck(root1.left, root2.left)
                && dfsCheck(root1.right, root2.right);
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        return (root1.val == root2.val && dfsCheck(root1, root2))
                || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
}