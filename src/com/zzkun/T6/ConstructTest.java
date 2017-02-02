package com.zzkun.T6;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConstructTest {

    @Test
    public void construct1() throws Exception {
        BTreeNode<Integer> tree = Construct.construct(new Integer[]{1, 2, 4, 7, 3, 5, 6, 8}, new Integer[]{4, 7, 2, 1, 5, 3, 8, 6});
        System.out.println(tree);
    }

    @Test
    public void construct2() throws Exception {
        BTreeNode<Integer> tree = Construct.construct(new Integer[]{2, 3, 1, 7, 4, 9, 10}, new Integer[]{1, 3, 7, 2, 9, 4, 10});
        System.out.println(tree);
    }

    @Test
    public void construct3() throws Exception {
        BTreeNode<Integer> tree = Construct.construct(new Integer[]{2, 3, 1, 7, 4, 9}, new Integer[]{1, 3, 7, 2, 9, 4});
        System.out.println(tree);
    }

    @Test
    public void construct4() throws Exception {
        BTreeNode<Integer> tree = Construct.construct(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3});
        System.out.println(tree);
    }

    @Test
    public void construct5() throws Exception {
        BTreeNode<Integer> tree = Construct.construct(new Integer[]{1}, new Integer[]{1});
        System.out.println(tree);
    }

}