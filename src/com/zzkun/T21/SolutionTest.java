package com.zzkun.T21;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class SolutionTest {

    private Solution stack = new Solution();

    @Test
    public void test1() throws Exception {
        Random random = new Random();
        for(int i = 0; i < 5; ++i) {
            int r = random.nextInt();
            stack.push(r);
            System.out.println("ADD:" + r + " MIN:" + stack.min() + " TOP:" + stack.top());
        }
    }
}