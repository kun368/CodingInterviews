package com.zzkun.T11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {

    private static final double eps = 0.001;

    private Solution solution = new Solution();

    @Test
    public void power() throws Exception {
        for(int i = -10; i <= 10; ++i) {
            assertEquals(Math.pow(Math.PI, i), solution.Power(Math.PI, i), eps);
            assertEquals(Math.pow(-Math.PI, i), solution.Power(-Math.PI, i), eps);
        }
    }

}