package com.zzkun.T6;

/**
 * Created by kun36 on 2017/1/31.
 */
public class Construct {

    private static <E> BTreeNode<E> constructCore(E[] pre, int st1, int ed1, E[] in, int st2, int ed2) {
        BTreeNode<E> root = new BTreeNode<E>();
        root.val = pre[st1];
        if(st1 < ed1) {
            for(int i = st2; i <= ed2; ++i) {
                if(in[i] == root.val) {
                    int szl = i - st2;
                    int szr = ed2 - i;
                    if(szl > 0)
                        root.lson = constructCore(pre, st1 + 1, st1 + szl, in, st2, i - 1);
                    if(szr > 0)
                        root.rson = constructCore(pre, ed1 - szr + 1, ed1, in, i + 1, ed2);
                    break;
                }
            }
        }
        return root;
    }

    public static <E> BTreeNode<E> construct(E[] pre, E[] in) {
        return constructCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
}
