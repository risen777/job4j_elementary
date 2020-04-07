package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class CounterTest {

    @Test
    public void sumWhenStart1Finish6() {
        int expected = 6;
        int out = Counter.sum(1, 3);
        Assert.assertThat(out, is(expected));
    }

    @Test
    public void sumByEvenWhenStart1Finish10() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEvenWhenStart0Finish3() {
        int rsl = Counter.sumByEven(1, 3);
        int expected = 2;
        assertThat(rsl, is(expected));
    }

}