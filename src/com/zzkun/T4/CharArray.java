package com.zzkun.T4;

public class CharArray {

    char[] str;
    int len;

    public CharArray(char[] str, int len) {
        this.str = str;
        this.len = len;
    }

    public boolean isEmpty() {
        return str == null || len == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(str, 0, len);
    }
}