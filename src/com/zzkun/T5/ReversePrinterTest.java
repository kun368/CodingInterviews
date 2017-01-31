package com.zzkun.T5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/1/31.
 */
public class ReversePrinterTest {

    @Test
    public void reversePrintKList1() throws Exception {
        KList<String> list = new KList<>();
        list.addTail("abc");
        list.addTail("cde");
        list.addTail("heheda");
        list.addTail("nihao");
        ReversePrinter.reversePrintKList(list);
        list.removeNode("heheda");
        ReversePrinter.reversePrintKList(list);
    }

    @Test
    public void reversePrintKList2() throws Exception {
        KList<String> list = new KList<>();
        list.addTail("abc");
        ReversePrinter.reversePrintKList(list);
    }

    @Test
    public void reversePrintKList3() throws Exception {
        KList<String> list = new KList<>();
        ReversePrinter.reversePrintKList(list);
    }
}