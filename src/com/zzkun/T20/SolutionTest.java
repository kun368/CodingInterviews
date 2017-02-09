package com.zzkun.T20;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void printMatrix0() throws Exception {
        int[][] mat = {
                {1, 3, 5},
                {3, 6, 8},
                {4, 6, 9}
        };
        ArrayList<Integer> list = solution.printMatrix(mat);
        System.out.println(list);
    }

    @Test
    public void printMatrix1() throws Exception {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ArrayList<Integer> list = solution.printMatrix(mat);
        System.out.println(list);
    }

    @Test
    public void printMatrix2() throws Exception {
        int[][] mat = {
                {1, 3, 5},
                {2, 5, 8}
        };
        ArrayList<Integer> list = solution.printMatrix(mat);
        System.out.println(list);
    }

    @Test
    public void printMatrix3() throws Exception {
        int[][] mat = {
                {1, 3, 5}
        };
        ArrayList<Integer> list = solution.printMatrix(mat);
        System.out.println(list);
    }

    @Test
    public void printMatrix4() throws Exception {
        int[][] mat = {
                {1}, {3}, {5}
        };
        ArrayList<Integer> list = solution.printMatrix(mat);
        System.out.println(list);
    }

}