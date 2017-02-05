package com.zzkun.T10;

public class Solution {
    public int NumberOf1(int n) {
        int ans = 0;
        while(n != 0) {
            ++ans;
            n = n & (n - 1);
        }
        return ans;
    }
}