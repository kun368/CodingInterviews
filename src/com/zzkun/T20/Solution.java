package com.zzkun.T20;

import java.util.ArrayList;

/**
 * 抽象问题具体化：不论哪个方向，都是碰壁后右拐
 * 若右拐后依然无法前进，则停止
 */
public class Solution {

    private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private boolean[][] vis;

    private boolean ok(int x, int y, int X, int Y) {
        return x >= 0 && x < X && y >= 0 && y < Y && !vis[x][y];
    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int lenx, leny;
        if (matrix == null || (lenx = matrix.length) == 0 || (leny = matrix[0].length) == 0)
            return res;
        vis = new boolean[lenx][leny];
        int cur = 0, x = 0, y = 0;
        while (true) {
            if (!ok(x, y, lenx, leny))
                break;
            res.add(matrix[x][y]);
            vis[x][y] = true;
            int xx = x + dirs[cur][0], yy = y + dirs[cur][1];
            if (ok(xx, yy, lenx, leny)) {
                x = xx;
                y = yy;
            } else {
                cur = (cur + 1) % 4;
                x += dirs[cur][0];
                y += dirs[cur][1];
            }
        }
        return res;
    }
}