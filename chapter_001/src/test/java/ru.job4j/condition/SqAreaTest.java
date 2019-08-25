package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        int expected = 2;
        int out = (int) SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }
}
