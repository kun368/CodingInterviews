package com.zzkun.T9;

import java.math.BigInteger;

/**
 * Created by kun36 on 2017/2/3.
 */
public class Main {

    public static BigInteger fibonacci(int n) {
        if(n < 2) return BigInteger.valueOf(n);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c;
        for(int i = 2; i <= n; ++i) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
