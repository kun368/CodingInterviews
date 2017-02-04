package com.zzkun.T12;

import java.math.BigInteger;

/**
 * 大数解法
 * Created by kun36 on 2017/2/4.
 */
public class Solver1 {
    public static void print1ToMaxOfDigits(int n) {
        if(n <= 0) return;
        BigInteger upper = BigInteger.TEN.pow(n);
        for(BigInteger i = BigInteger.ONE; i.compareTo(upper) < 0; i = i.add(BigInteger.ONE))
            System.out.println(i);
    }
}
