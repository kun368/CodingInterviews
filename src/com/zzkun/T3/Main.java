package com.zzkun.T3;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by kun36 on 2017/1/28.
 */
public class Main {

    public static boolean find(int[][] matrix, int cols, int number) {
        if(matrix == null)
            return false;
        int rows = matrix.length;
        int r1 = rows-1, r2 = 0;
        for(int i = 0; i < rows; ++i)
            if(matrix[i][0] <= number && number <= matrix[i][cols-1]) {
                r1 = min(r1, i);
                r2 = max(r2, i);
            }
        if(r1 > r2)
            return false;
        for(int i = 0; i < cols; ++i)
            if(matrix[r1][i] <= number && number <= matrix[r2][i])
                return true;
        return false;
    }
}
