package com.zzkun.T4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void replaceSpace() throws Exception {
        System.out.println(solution.replaceSpace(new StringBuffer("We are happy")));
        System.out.println(solution.replaceSpace(new StringBuffer(" We are happy ")));
        System.out.println(solution.replaceSpace(new StringBuffer("Ha    Ha")));
        System.out.println(solution.replaceSpace(new StringBuffer("HAHA")));
        System.out.println(solution.replaceSpace(new StringBuffer("    ")));
        System.out.println(solution.replaceSpace(new StringBuffer(" ")));
    }

}