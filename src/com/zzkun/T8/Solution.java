package com.zzkun.T8;

/**
 * 递归解法，思想基于分治...
 */
public class Solution {

    private int dfs(int[] arr, int L, int R) {
        if(R - L <= 1)
            return Math.min(arr[L], arr[R]);
        if(arr[L] < arr[R])
            return arr[L];
        int mid = (L + R) >> 1;
        if(arr[L] == arr[R] && arr[L] == arr[mid]) {
            int ans = arr[L];
            for(int i = L + 1; i <= R; ++i)
                ans = Math.min(ans, arr[i]);
            return ans;
        }
        if(arr[mid] >= arr[L])
            return dfs(arr, mid + 1, R);
        return dfs(arr, L, mid);
    }

    public int minNumberInRotateArray(int [] array) {
        return dfs(array, 0, array.length - 1);
    }
}