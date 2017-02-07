package com.zzkun.T14;

public class Solution {

    private boolean judge(int x) {
        return x % 2 == 1;
    }

    public void reOrderArray(int [] array) {
        int[] tmp = new int[array.length];
        int a = 0, b = 0;
        for(int i = 0; i < array.length; ++i) {
            if(judge(array[i])) array[a++] = array[i];
            else tmp[b++] = array[i];
        }
        for(int i = 0; i < b; ++i)
            array[a++] = tmp[i];
    }
}
