package com.zzkun.T11;

/**
 * Created by kun36 on 2017/2/4.
 */
public class Calculator {

    private static double powCore(double x, int y) {
        double res = 1, base = x;
        while(y != 0) {
            if((y & 1) != 0)
                res *= base;
            base *= base;
            y >>= 1;
        }
        return res;
    }

    public static double pow(double x, int y) throws Exception {
        if(Math.abs(x) <= 1e-7 && y <= 0)
            throw new Exception("InvalidInput");
        if(y >= 0) return powCore(x, y);
        return 1.0 / powCore(x, -y);
    }
}
