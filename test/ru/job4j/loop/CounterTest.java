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
    public void sum() {
        int expected = 6;
        int out = Counter.sum(1, 3);
        Assert.assertThat(out, is(expected));
    }
}