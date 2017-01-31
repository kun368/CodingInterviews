package com.zzkun.T3;

import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/1/28.
 */
public class MainTest {


    @org.junit.Test
    public void find() throws Exception {
        assertEquals(true, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 7));
        assertEquals(true, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 2));
        assertEquals(false, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 14));
        assertEquals(true, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 1));
        assertEquals(true, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 15));
        assertEquals(false, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, -1));
        assertEquals(false, Main.find(new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }, 4, 100));
        assertEquals(false, Main.find(new int[][]{}, 0, 7));
        assertEquals(false, Main.find(null, 0, 7));

        assertEquals(false, Main.find(new int[][]{
                {1, 3},
                {5, 6}
        }, 2, 2));

        assertEquals(false, Main.find(new int[][]{
                {1, 5},
                {3, 6}
        }, 2, 2));
    }

}