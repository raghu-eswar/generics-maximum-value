package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxIntegerAtBeginning() {
        Max<Integer> max = new Max<>(82, 37,68);
        Assert.assertEquals(82, max.maxOf().intValue());
    }

    @Test
    public void maxIntegerAtSecond() {
        Max<Integer> max = new Max<>(32, 82,68);
        Assert.assertEquals(82, max.maxOf().intValue());
    }

    @Test
    public void maxIntegerAtLast() {
        Max<Integer> max = new Max<>(22, 37,82);
        Assert.assertEquals(82, max.maxOf().intValue());
    }

    @Test
    public void maxFloatValueAtBeginning() {
        Max<Float> max = new Max<>(30.3f, 20.2f,10.1f);
        Assert.assertEquals(30.3f, max.maxOf(), 0.0f);
    }

    @Test
    public void maxFloatValueAtSecond() {
        Max<Float> max = new Max<>(20.2f, 30.3f,10.1f);
        Assert.assertEquals(30.3f, max.maxOf(), 0.0f);
    }

    @Test
    public void maxFloatValueAtLast() {
        Max<Float> max = new Max<>(10.1f, 20.2f,30.3f);
        Assert.assertEquals(30.3f, max.maxOf(), 0.0f);
    }

    @Test
    public void maxStringAtBeginning() {
        Max<String> max = new Max<>("peanch", "apple", "bananna");
        Assert.assertEquals("peanch", max.maxOf());
    }

    @Test
    public void maxStringAtSecond() {
        Max<String> max = new Max<>("apple", "peanch", "bananna");
        Assert.assertEquals("peanch", max.maxOf());
    }

    @Test
    public void maxStringAtLast() {
        Max<String> max = new Max<>("apple", "bananna", "peanch");
        Assert.assertEquals("peanch", max.maxOf());
    }
}
