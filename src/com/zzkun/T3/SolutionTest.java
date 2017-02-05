package com.zzkun.T3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/5 0005.
 */
public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void find() throws Exception {
        assertEquals(true, solution.Find(7, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(false, solution.Find(5, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(true, solution.Find(2, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(false, solution.Find(14, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(true, solution.Find(1, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(true, solution.Find(15, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(false, solution.Find(-1, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(false, solution.Find(100, new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        }));
        assertEquals(false, solution.Find(7, new int[][]{}));
        assertEquals(false, solution.Find(7, null));
        assertEquals(false, solution.Find(2, new int[][]{
                {1, 3},
                {5, 6}
        }));
        assertEquals(false, solution.Find(2, new int[][]{
                {1, 5},
                {3, 6}
        }));
    }

}