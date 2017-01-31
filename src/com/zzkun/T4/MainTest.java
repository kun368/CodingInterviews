package com.zzkun.T4;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by kun36 on 2017/1/29.
 */
public class MainTest {

    public void test(String s) {
        char[] chars = s.toCharArray();
        CharArray str = new CharArray(new char[1024], chars.length);
        System.arraycopy(chars, 0, str.str, 0, chars.length);

        System.out.println(str);
        Main.replaceBlank(str);
        System.out.println(str);
    }

    @Test
    public void replaceBlank() throws Exception {
        test("We are happy");
        test(" We are happy ");
        test("Ha    Ha");
        test("HAHA");
        test("    ");
        test(" ");
    }

}