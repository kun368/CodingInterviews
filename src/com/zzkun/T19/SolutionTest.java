package com.zzkun.T19;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void mirror1() throws Exception {
        TreeNode tree = null;
        solution.Mirror(tree);
        System.out.println(tree);
    }

    @Test
    public void mirror2() throws Exception {
        TreeNode tree = new TreeNode(8, new TreeNode(6, new TreeNode(5), new TreeNode(7)),
                new TreeNode(10, new TreeNode(9), new TreeNode(11)));
        System.out.println(tree);
        solution.Mirror(tree);
        System.out.println(tree);
    }

}