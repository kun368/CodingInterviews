package com.zzkun.T8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {
    
    private Solution finder = new Solution();

    @Test
    public void minNumberInRotateArray0() throws Exception {
        int[] arr = {3, 4, 5, 1, 2};
        assertEquals(1, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray1() throws Exception {
        int[] arr = {3, 4, 5, 1, 2, 2, 2, 3};
        assertEquals(1, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray2() throws Exception {
        int[] arr = {3, 3, 5, 6, 7, 2, 3, 3};
        assertEquals(2, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray3() throws Exception {
        int[] arr = {3, 7, 2, 2, 2, 3, 3};
        assertEquals(2, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray4() throws Exception {
        int[] arr = {1, 0, 1, 1, 1};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray5() throws Exception {
        int[] arr = {1, 1, 1, 0, 1};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray6() throws Exception {
        int[] arr = {1, 1, 0, 1, 1};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray7() throws Exception {
        int[] arr = {0, 1, 1, 1, 1};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray8() throws Exception {
        int[] arr = {1, 1, 1, 1, 0};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray9() throws Exception {
        int[] arr = {0, 10};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

    @Test
    public void minNumberInRotateArray10() throws Exception {
        int[] arr = {0};
        assertEquals(0, finder.minNumberInRotateArray(arr));
    }

}