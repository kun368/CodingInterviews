package com.zzkun.T4;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str == null || str.length() == 0)
            return "";
        int preLen = str.length();
        for(int i = 0; i < preLen; ++i)
            if(str.charAt(i) == ' ')
                str.append("  ");
        int pos = str.length();
        for(int i = preLen - 1; i >= 0; --i) {
            if(str.charAt(i) == ' ') {
                str.setCharAt(--pos, '0');
                str.setCharAt(--pos, '2');
                str.setCharAt(--pos, '%');
            } else {
                str.setCharAt(--pos, str.charAt(i));
            }
        }
        return str.toString();
    }
}