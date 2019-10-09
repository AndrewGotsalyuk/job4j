package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2To3() {
        Max max = new Max();
        int result = max.max(1, 7,3);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax1To2To3To4() {
        Max max = new Max();
        int result = max.max(5, 2,3, 4);
        assertThat(result, is(5));
    }
}