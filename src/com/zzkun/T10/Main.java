package com.zzkun.T10;

/**
 * Created by kun36 on 2017/2/3.
 */
public class Main {

    public static int numberOf1(int x) {
        int ans = 0;
        while(x != 0) {
            ++ans;
            x = x & (x - 1);
        }
        return ans;
    }
}
