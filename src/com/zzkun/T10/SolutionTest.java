package com.zzkun.T10;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void NumberOf1() throws Exception {
        assertEquals(Integer.bitCount(1), solution.NumberOf1(1));
        assertEquals(Integer.bitCount(2), solution.NumberOf1(2));
        assertEquals(Integer.bitCount(0x7fffffff), solution.NumberOf1(0x7fffffff));
        assertEquals(Integer.bitCount(0x80000000), solution.NumberOf1(0x80000000));
        assertEquals(Integer.bitCount(-5), solution.NumberOf1(-5));
        assertEquals(Integer.bitCount(0), solution.NumberOf1(0));
        Random random = new Random();
        for(int i = 0; i < 10000; ++i) {
            int x = random.nextInt();
            assertEquals(Integer.bitCount(x), solution.NumberOf1(x));
        }
    }

}