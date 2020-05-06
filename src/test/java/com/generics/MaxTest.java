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
}
