package com.zzkun.T3;

public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null)
            return false;
        int rows, cols;
        if((rows = array.length) == 0 || (cols = array[0].length) == 0)
            return false;
        for(int i = 0, j = cols - 1; i < rows && j >= 0; ) {
            if(array[i][j] == target)
                return true;
            if(array[i][j] > target) --j;
            else ++i;
        }
        return false;
    }
}