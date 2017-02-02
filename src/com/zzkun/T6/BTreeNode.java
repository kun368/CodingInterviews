package com.zzkun.T6;


public class BTreeNode<E> {

    E val;
    BTreeNode<E> lson = null;
    BTreeNode<E> rson = null;

    @Override
    public String toString() {
        return "BTreeNode{" +
                "val=" + val +
                ", lson=" + lson +
                ", rson=" + rson +
                '}';
    }
}
