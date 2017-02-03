package com.zzkun.T10;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/3.
 */
public class MainTest {

    @Test
    public void numberOf1() throws Exception {
        assertEquals(Integer.bitCount(1), Main.numberOf1(1));
        assertEquals(Integer.bitCount(2), Main.numberOf1(2));
        assertEquals(Integer.bitCount(0x7fffffff), Main.numberOf1(0x7fffffff));
        assertEquals(Integer.bitCount(0x80000000), Main.numberOf1(0x80000000));
        assertEquals(Integer.bitCount(-5), Main.numberOf1(-5));
        assertEquals(Integer.bitCount(0), Main.numberOf1(0));
        Random random = new Random();
        for(int i = 0; i < 10000; ++i) {
            int x = random.nextInt();
            assertEquals(Integer.bitCount(x), Main.numberOf1(x));
        }
    }

}