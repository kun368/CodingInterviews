package com.zzkun.T22;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void isPopOrder0() throws Exception {
        assertEquals(true, solution.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{3, 2, 4, 1, 5}));

    }

    @Test
    public void isPopOrder1() throws Exception {
        assertEquals(true, solution.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

}