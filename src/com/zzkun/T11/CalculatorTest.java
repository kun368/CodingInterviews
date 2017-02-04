package com.zzkun.T11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/4.
 */
public class CalculatorTest {

    private static final double eps = 0.001;

    @Test
    public void pow() throws Exception {
        for(int i = -10; i <= 10; ++i) {
            assertEquals(Math.pow(Math.PI, i), Calculator.pow(Math.PI, i), eps);
            assertEquals(Math.pow(-Math.PI, i), Calculator.pow(-Math.PI, i), eps);
        }
    }
}