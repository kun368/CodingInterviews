package com.zzkun.T8;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/2/3.
 */
public class MinFinderTest {

    private MinFinder finder = new MinFinder();

    @Test
    public void findMin0() throws Exception {
        int[] arr = {3, 4, 5, 1, 2};
        assertEquals(1, finder.findMin(arr));
    }

    @Test
    public void findMin1() throws Exception {
        int[] arr = {3, 4, 5, 1, 2, 2, 2, 3};
        assertEquals(1, finder.findMin(arr));
    }

    @Test
    public void findMin2() throws Exception {
        int[] arr = {3, 3, 5, 6, 7, 2, 3, 3};
        assertEquals(2, finder.findMin(arr));
    }

    @Test
    public void findMin3() throws Exception {
        int[] arr = {3, 7, 2, 2, 2, 3, 3};
        assertEquals(2, finder.findMin(arr));
    }

    @Test
    public void findMin4() throws Exception {
        int[] arr = {1, 0, 1, 1, 1};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin5() throws Exception {
        int[] arr = {1, 1, 1, 0, 1};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin6() throws Exception {
        int[] arr = {1, 1, 0, 1, 1};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin7() throws Exception {
        int[] arr = {0, 1, 1, 1, 1};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin8() throws Exception {
        int[] arr = {1, 1, 1, 1, 0};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin9() throws Exception {
        int[] arr = {0, 10};
        assertEquals(0, finder.findMin(arr));
    }

    @Test
    public void findMin10() throws Exception {
        int[] arr = {0};
        assertEquals(0, finder.findMin(arr));
    }

}