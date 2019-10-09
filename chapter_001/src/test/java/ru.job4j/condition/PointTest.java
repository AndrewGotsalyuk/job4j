package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        int out = (int) a.distance(b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 4);
        double expected = 3.6;
        double out = (int) a.distance3d(b);
        assertThat(out, closeTo(expected, 0.4));
    }

}
