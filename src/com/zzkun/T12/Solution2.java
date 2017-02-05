package com.zzkun.T12;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列递归解法
 * Created by kun36 on 2017/2/4.
 */
public class Solution2 {

    private static void dfs(LinkedList<Character> list, int deep, int n) {
        if(deep >= n) {
            if(!list.isEmpty()) {
                for (Character c : list)
                    System.out.print(c);
                System.out.println();
            }
            return;
        }
        for(int i = 0; i <= 9; ++i) {
            boolean isAppend = list.size() > 0 || (list.size() == 0 && i > 0);
            if(isAppend) list.addLast((char) ('0' + i));
            dfs(list, deep + 1, n);
            if(isAppend) list.removeLast();
        }
    }

    public static void print1ToMaxOfDigits(int n) {
        if(n <= 0) return;
        dfs(new LinkedList<>(), 0, n);
    }
}
