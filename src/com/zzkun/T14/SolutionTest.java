package com.zzkun.T14;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void reOrderArray() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        solution.reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}