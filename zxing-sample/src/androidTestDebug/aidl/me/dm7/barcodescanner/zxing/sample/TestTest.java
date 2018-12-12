package me.dm7.barcodescanner.zxing.sample;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class TestTest {
    //private Test test = new Test();
    @org.junit.Test
    public void add() {
        int a = 1, b = 2;
        int result = test.add(a, b);
        Assert.assertEquals(result, 3);
    }

    @org.junit.Test
    public void sub() {
        int a = 2, b = 1;
        int result = test.sub(a, b);
        Assert.assertEquals(result, 1);
    }
}