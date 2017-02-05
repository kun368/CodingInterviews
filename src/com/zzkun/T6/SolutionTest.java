package com.zzkun.T6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void construct1() throws Exception {
        TreeNode tree = solution.reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
        System.out.println(tree);
    }

    @Test
    public void construct2() throws Exception {
        TreeNode tree = solution.reConstructBinaryTree(new int[]{2, 3, 1, 7, 4, 9, 10}, new int[]{1, 3, 7, 2, 9, 4, 10});
        System.out.println(tree);
    }

    @Test
    public void construct3() throws Exception {
        TreeNode tree = solution.reConstructBinaryTree(new int[]{2, 3, 1, 7, 4, 9}, new int[]{1, 3, 7, 2, 9, 4});
        System.out.println(tree);
    }

    @Test
    public void construct4() throws Exception {
        TreeNode tree = solution.reConstructBinaryTree(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(tree);
    }

    @Test
    public void construct5() throws Exception {
        TreeNode tree = solution.reConstructBinaryTree(new int[]{1}, new int[]{1});
        System.out.println(tree);
    }
}