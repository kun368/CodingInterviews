package com.zzkun.T9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/3.
 */
public class MainTest {

    @Test
    public void fibonacci() throws Exception {
        for(int i = 0; i < 100; ++i) {
            System.out.println(Main.fibonacci(i));
        }
    }

}