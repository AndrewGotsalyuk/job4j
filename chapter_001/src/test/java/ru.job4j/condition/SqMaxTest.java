package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax8() {
        SqMax check = new SqMax();
        int result = check.max(4, 2, 8, 1);
        assertThat(result, is(8));
    }
    @Test
    public void whenForthMax8() {
        SqMax check = new SqMax();
        int result = check.max(4, 2, 3, 8);
        assertThat(result, is(8));
    }
}
