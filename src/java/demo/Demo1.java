package demo;

import oahu.annotations.Cache;

/**
 * Created by rcs on 24.03.17.
 *
 */
public class Demo1 {
    @Cache(id=1)
    public int calc1(int v) {
        System.out.println("Calculating first time: " + v);
        return 2*v;
    }
}
