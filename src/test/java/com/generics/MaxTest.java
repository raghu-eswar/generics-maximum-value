package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxIntegerAtBeginning() {
        Integer result = Max.maxOf(82,37,68);
        Assert.assertEquals(82, result.intValue());
    }

    @Test
    public void maxIntegerAtSecond() {
        Integer result = Max.maxOf(22,82,68);
        Assert.assertEquals(82, result.intValue());
    }

    @Test
    public void maxIntegerAtLast() {
        Integer result = Max.maxOf(42,37,68);
        Assert.assertEquals(68, result.intValue());
    }

    @Test
    public void maxFloatValueAtBeginning() {
        Float result = Max.maxOf(30.3f, 20.2f,10.1f);
        Assert.assertEquals(30.3f, result, 0.0f);
    }

    @Test
    public void maxFloatValueAtSecond() {
        Float result = Max.maxOf(10.1f, 30.3f,20.2f);
        Assert.assertEquals(30.3f, result, 0.0f);
    }

    @Test
    public void maxFloatValueAtLast() {
        Float result = Max.maxOf(10.1f, 20.2f,30.3f);
        Assert.assertEquals(30.3f, result, 0.0f);
    }

    @Test
    public void maxStringAtBeginning() {
        String result = Max.maxOf("peanch", "apple", "bananna");
        Assert.assertEquals("peanch", result);
    }

    @Test
    public void maxStringAtSecond() {
        String result = Max.maxOf("apple", "peanch", "bananna");
        Assert.assertEquals("peanch", result);
    }

    @Test
    public void maxStringAtLast() {
        String result = Max.maxOf("apple", "bananna", "peanch");
        Assert.assertEquals("peanch", result);
    }
}
