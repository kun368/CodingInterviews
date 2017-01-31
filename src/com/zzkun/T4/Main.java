package com.zzkun.T4;

/**
 * Created by kun36 on 2017/1/29.
 */
public class Main {

    public static CharArray replaceBlank(CharArray str) {
        if(str == null || str.isEmpty())
            return str;
        int pos = str.len;
        for(int i = 0; i < str.len; ++i)
            if(str.str[i] == ' ')
                pos += 2;
        int newLen = pos;
        for(int i = str.len - 1; i >= 0; --i) {
            if(str.str[i] == ' ') {
                str.str[--pos] = '0';
                str.str[--pos] = '2';
                str.str[--pos] = '%';
            } else {
                str.str[--pos] = str.str[i];
            }
        }
        str.len = newLen;
        return str;
    }

}
