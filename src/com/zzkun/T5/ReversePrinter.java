package com.zzkun.T5;

/**
 * Created by kun36 on 2017/1/31.
 */
public class ReversePrinter {

    private static void dfsPrint(KListNode node) {
        if(node == null)
            return;
        dfsPrint(node.next);
        System.out.println(node.val);
    }

    public static void reversePrintKList(KList kList) {
        dfsPrint(kList.head);
    }

}
