package com.whizdm.testlib;

/**
 * Created by nayan on 16/11/17.
 */

public class Test {
    public static int add(int... a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }
}
