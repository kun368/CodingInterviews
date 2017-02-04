package com.zzkun.T12;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/4.
 */
public class SolverTest {

    @Test
    public void test1() throws Exception {
        Solver1.print1ToMaxOfDigits(1);
        Solver1.print1ToMaxOfDigits(4);
    }

    @Test
    public void test2() throws Exception {
        Solver2.print1ToMaxOfDigits(1);
        Solver2.print1ToMaxOfDigits(4);
    }


}